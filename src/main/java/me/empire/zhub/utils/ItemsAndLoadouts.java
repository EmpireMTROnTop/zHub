package me.empire.zhub.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemsAndLoadouts {

    public static void hubStuff(Player to){
        ItemStack butt = new ItemStack(Material.ENDER_PEARL);
        ItemMeta buttmeta = butt.getItemMeta();
        buttmeta.setDisplayName(C.color("&2&lEnder Butt &7(Right Click)"));
        butt.setItemMeta(buttmeta);
        to.getInventory().clear();
        to.getInventory().setItem(4, butt);
    }
}