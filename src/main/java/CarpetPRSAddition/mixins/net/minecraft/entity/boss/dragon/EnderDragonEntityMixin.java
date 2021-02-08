package CarpetPRSAddition.mixins.net.minecraft.entity.boss.dragon;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnderDragonEntity.class)
public class EnderDragonEntityMixin {
    @Redirect(
        method = "destroyBlocks",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean destroyBlocks(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingEnderDragonDestroyBlocks;
        }
        return gameRules.getBoolean(rule);
    }
}
