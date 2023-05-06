package spigot.whodigsdiaminds.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            return;
        }
        if (event.getClickedBlock().getType() == Material.DIAMOND_ORE) {
            Block block = event.getClickedBlock();
            int x = block.getLocation().getBlockX();
            int y = block.getLocation().getBlockY();
            int z = block.getLocation().getBlockZ();

            event.getPlayer().getServer().getConsoleSender().sendMessage("X:" + x +"," + "Y:" + y + "," + "Z:" + z);
        } else if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE) {
            Block block = event.getClickedBlock();
            int x = block.getLocation().getBlockX();
            int y = block.getLocation().getBlockY();
            int z = block.getLocation().getBlockZ();

            event.getPlayer().getServer().getConsoleSender().sendMessage("X:" + x +"," + "Y:" + y + "," + "Z:" + z);
        }
    }
}
