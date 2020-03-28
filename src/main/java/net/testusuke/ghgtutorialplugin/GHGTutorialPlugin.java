package net.testusuke.ghgtutorialplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class GHGTutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("ench").setExecutor(new EnchantmentCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
