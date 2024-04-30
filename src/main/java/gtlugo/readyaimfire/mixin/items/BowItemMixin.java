package gtlugo.readyaimfire.mixin.items;

import net.minecraft.item.BowItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(BowItem.class)
public abstract class BowItemMixin {
  @ModifyArg(
      method = "onStoppedUsing",
      at = @At(
          value = "INVOKE",
          target = "Lnet/minecraft/entity/projectile/PersistentProjectileEntity;setVelocity(Lnet/minecraft/entity/Entity;FFFFF)V"
      ),
      index = 5
  )
  private float divergence(float f) {
    return 0;
  }
}
