package CarpetPRSAddition.mixins.net.minecraft.entity.ai.brain.task;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.ai.brain.task.FarmerVillagerTask;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FarmerVillagerTask.class)
public class FarmerVillagerTaskMixin {
    @Redirect(method = "shouldRun",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"
        )
    )
    private boolean shouldRun(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride) {
            return CarpetPRSAdditionSettings.mobGriefingFarmerVillagerShouldRun;
        }
        return gameRules.getBoolean(rule);
    }
}
