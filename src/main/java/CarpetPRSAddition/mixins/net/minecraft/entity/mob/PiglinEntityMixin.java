package CarpetPRSAddition.mixins.net.minecraft.entity.mob;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PiglinEntity.class)
public class PiglinEntityMixin {
    @Redirect(
        method = "canGather",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean canGather(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingPiglinGather;
        }
        return gameRules.getBoolean(rule);
    }
}
