package com.LPC1.Lmod.injection.mixins;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static com.LPC1.Lmod.injection.clicker.AutoClicker.ReachValue;

@Mixin(PlayerControllerMP.class)
public class MixinPlayerControllerMP {

    /**
     * @author
     */
    @Overwrite
    public float getBlockReachDistance() {
        if (ReachValue != 0) {
            return ReachValue + 1.5F;
        } else { return 4.5F; }
    }
}

