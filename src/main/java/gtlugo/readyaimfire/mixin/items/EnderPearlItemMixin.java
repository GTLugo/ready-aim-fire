package gtlugo.readyaimfire.mixin.items;

import net.minecraft.item.EnderPearlItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(EnderPearlItem.class)
public abstract class EnderPearlItemMixin {
  @ModifyArg(
      method = "use",
      at = @At(
          value = "INVOKE",
          target = "Lnet/minecraft/entity/projectile/thrown/EnderPearlEntity;setVelocity(Lnet/minecraft/entity/Entity;FFFFF)V"
      ),
      index = 5
  )
  private float divergence(float f) {
    return 0;
  }
}
