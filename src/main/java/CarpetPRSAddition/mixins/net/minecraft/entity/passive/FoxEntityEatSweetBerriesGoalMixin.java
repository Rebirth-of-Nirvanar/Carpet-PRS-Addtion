package CarpetPRSAddition.mixins.net.minecraft.entity.passive;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FoxEntity.EatSweetBerriesGoal.class)
public class FoxEntityEatSweetBerriesGoalMixin {
    @Redirect(
        method = "eatSweetBerry",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean canEatSweetBerry(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingFoxEatSweetBerries;
        }
        return gameRules.getBoolean(rule);
    }
}
