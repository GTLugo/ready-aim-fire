package gtlugo.readyaimfire.mixin.items;

import net.minecraft.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(TridentItem.class)
public abstract class TridentItemMixin {
  @ModifyArg(
      method = "onStoppedUsing",
      at = @At(
          value = "INVOKE",
          target = "Lnet/minecraft/entity/projectile/TridentEntity;setVelocity(Lnet/minecraft/entity/Entity;FFFFF)V"
      ),
      index = 5
  )
  private float divergence(float f) {
    return 0;
  }
}
