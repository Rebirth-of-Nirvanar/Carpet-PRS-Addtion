package CarpetPRSAddition.mixins.net.minecraft.entity.passive;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SnowGolemEntity.class)
public class SnowGolemEntityMixin {
    @Redirect(
        method = "tickMovement",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean canSpawnSnow(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingSnowGolemSpawnSnow;
        }
        return gameRules.getBoolean(rule);
    }
}
