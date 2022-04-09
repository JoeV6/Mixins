package com.LPC1.Lmod.injection.setup;

import com.LPC1.Lmod.injection.clicker.AutoClicker;
import com.LPC1.Lmod.injection.clicker.InGameCommands;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;

public class Setup {

    public Setup() {
        MinecraftForge.EVENT_BUS.register(new AutoClicker());
        ClientCommandHandler.instance.registerCommand(new InGameCommands());
    }
}
