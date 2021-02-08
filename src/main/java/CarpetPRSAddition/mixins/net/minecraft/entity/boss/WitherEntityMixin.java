package CarpetPRSAddition.mixins.net.minecraft.entity.boss;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(WitherEntity.class)
public class WitherEntityMixin {
    @Shadow private int field_7082;

    @Redirect(
        method = "mobTick",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/World;createExplosion(Lnet/minecraft/entity/Entity;DDDFZLnet/minecraft/world/explosion/Explosion$DestructionType;)Lnet/minecraft/world/explosion/Explosion;"
        )
    )
    private Explosion mobTick_createExplosion(World world, Entity entity, double x, double y, double z, float power, boolean createFire, Explosion.DestructionType destructionType)
    {
        if (CarpetPRSAdditionSettings.mobGriefingOverride && !CarpetPRSAdditionSettings.mobGriefingWitherCreateExplosion) {
            return world.createExplosion(entity, x, y, z, power, createFire, Explosion.DestructionType.NONE);
        }
        return world.createExplosion(entity, x, y, z, power, createFire, destructionType);
    }

    @Redirect(
        method = "mobTick",
        at = @At(
            value = "FIELD",
            target = "Lnet/minecraft/entity/boss/WitherEntity;field_7082:I",
            opcode = Opcodes.GETFIELD
        )
    )
    private int mobTick_canDestroy(WitherEntity witherEntity) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride && !CarpetPRSAdditionSettings.mobGriefingWitherCanDestroy) {
            return 0;
        }
        return this.field_7082;
    }
}
