package spigot.whodigsdiaminds;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.whodigsdiaminds.events.PlayerInteract;

public final class WhoDigsDiaminds extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerInteract(), this);
    }
}
