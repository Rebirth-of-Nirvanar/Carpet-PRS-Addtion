package CarpetPRSAddition.mixins.net.minecraft.entity.projectile;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(WitherSkullEntity.class)
public class WitherSkullEntityMixin {
    @Redirect(
        method = "onCollision",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/World;createExplosion(Lnet/minecraft/entity/Entity;DDDFZLnet/minecraft/world/explosion/Explosion$DestructionType;)Lnet/minecraft/world/explosion/Explosion;"
        )
    )
    private Explosion onCollision_createExplosion(World world, Entity entity, double x, double y, double z, float power, boolean createFire, Explosion.DestructionType destructionType)
    {
        if (CarpetPRSAdditionSettings.mobGriefingOverride && !CarpetPRSAdditionSettings.mobGriefingWitherSkullCreateExplosion) {
            return world.createExplosion(entity, x, y, z, power, createFire, Explosion.DestructionType.NONE);
        }
        return world.createExplosion(entity, x, y, z, power, createFire, destructionType);
    }
}
