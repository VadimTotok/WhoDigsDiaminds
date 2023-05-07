package spigot.whodigsdiaminds;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.whodigsdiaminds.events.BlockBreak;

public final class WhoDigsDiaminds extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BlockBreak(), this);
    }
}
