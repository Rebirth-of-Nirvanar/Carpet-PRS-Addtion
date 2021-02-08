package CarpetPRSAddition.mixins.net.minecraft.entity.mob;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SilverfishEntity.CallForHelpGoal.class)
public class SilverfishEntityCallForHelpGoalMixin {
    @Redirect(
            method = "tick",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"

            )
    )
    private boolean canStart(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingSilverfishOutOfBlocks;
        }
        return gameRules.getBoolean(rule);
    }
}
