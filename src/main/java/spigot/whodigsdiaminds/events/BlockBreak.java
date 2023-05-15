package spigot.whodigsdiaminds.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Material material = block.getType();
        int x = block.getLocation().getBlockX();
        int y = block.getLocation().getBlockY();
        int z = block.getLocation().getBlockZ();

        if (material.equals(Material.DIAMOND_ORE)) {
            event.getPlayer().getServer().getConsoleSender().sendMessage(
                    ChatColor.GRAY + "[WhoDigsDiamonds] " +
                            ChatColor.YELLOW + "Material: DIAMOND_ORE " +
                                ChatColor.DARK_GREEN + "X:" + x +"," + "Y:" + y + "," + "Z:" + z
            );
        }
        if (material.equals(Material.DEEPSLATE_DIAMOND_ORE)) {
            event.getPlayer().getServer().getConsoleSender().sendMessage(
                    ChatColor.GRAY + "[WhoDigsDiamonds] " +
                            ChatColor.YELLOW + "Material: DIAMOND_ORE " +
                                ChatColor.DARK_GREEN + "X:" + x +"," + "Y:" + y + "," + "Z:" + z
            );
        }
        if (material.equals(Material.ANCIENT_DEBRIS)) {
            event.getPlayer().getServer().getConsoleSender().sendMessage(
                    ChatColor.GRAY + "[WhoDigsDiamonds] " +
                            ChatColor.YELLOW + "Material: ANCIENT_DEBRIS " +
                                ChatColor.DARK_GREEN + "X:" + x +"," + "Y:" + y + "," + "Z:" + z
            );
        }
    }
}
