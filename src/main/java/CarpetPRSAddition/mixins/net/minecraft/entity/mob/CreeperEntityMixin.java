package CarpetPRSAddition.mixins.net.minecraft.entity.mob;

import CarpetPRSAddition.CarpetPRSAdditionSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin {
    @Redirect(
        method = "explode",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/World;createExplosion(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/world/explosion/Explosion$DestructionType;)Lnet/minecraft/world/explosion/Explosion;"
        )
    )
    private Explosion explode(World world, Entity entity, double x, double y, double z, float power, Explosion.DestructionType destructionType) {
        if (CarpetPRSAdditionSettings.mobGriefingOverride &&!CarpetPRSAdditionSettings.mobGriefingCreeperCreateExplosion) {
            return world.createExplosion(entity, x, y, z, power, Explosion.DestructionType.NONE);
        }
        return world.createExplosion(entity, x, y, z, power, destructionType);
    }
}
