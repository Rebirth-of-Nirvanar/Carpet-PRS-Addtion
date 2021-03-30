package CarpetPRSAddition.mixins.net.minecraft.world;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(World.class)
public class WorldMixin {
    @Inject(
        method = "tickEntity(Ljava/util/function/Consumer;Lnet/minecraft/entity/Entity;)V",
        at = @At(
            "HEAD"
        ),
        cancellable = true
    )
    private void preventEntityTicking(Consumer<Entity> consumer, Entity entityIn, CallbackInfo ci)
    {
        if (CarpetPRSAdditionSettings.disableWitherTicking && entityIn instanceof WitherEntity)
        {
            ci.cancel();
        }
    }
}
