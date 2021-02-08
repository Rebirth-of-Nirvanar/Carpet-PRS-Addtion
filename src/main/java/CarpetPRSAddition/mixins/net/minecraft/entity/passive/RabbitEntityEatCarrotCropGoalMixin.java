package CarpetPRSAddition.mixins.net.minecraft.entity.passive;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(RabbitEntity.EatCarrotCropGoal.class)
public class RabbitEntityEatCarrotCropGoalMixin {
    @Redirect(
        method = "canStart",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean canStart(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingRabbitEatCarrotCrop;
        }
        return gameRules.getBoolean(rule);
    }
}
