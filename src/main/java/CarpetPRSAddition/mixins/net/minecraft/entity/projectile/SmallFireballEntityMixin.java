package CarpetPRSAddition.mixins.net.minecraft.entity.projectile;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SmallFireballEntity.class)
public class SmallFireballEntityMixin {
    @Redirect(
        method = "onBlockHit",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean canGather(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingSmallFireballSpawnFire;
        }
        return gameRules.getBoolean(rule);
    }
}
