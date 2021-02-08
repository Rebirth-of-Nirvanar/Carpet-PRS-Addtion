package CarpetPRSAddition.mixins.net.minecraft.entity.mob;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EndermanEntity.PlaceBlockGoal.class)
public class EndermanEntityPlaceBlockGoalMixin {
    @Redirect(
        method = "canStart",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean placeBlock(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingEnderManPlaceBlock;
        }
        return gameRules.getBoolean(rule);
    }
}
