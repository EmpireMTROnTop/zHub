package me.empire.zhub.listeners;

import me.empire.zhub.utils.C;
import me.empire.zhub.zHub;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.spigotmc.event.entity.EntityDismountEvent;

public class ClickListener implements Listener {

    @EventHandler
    public void noLandDamage(EntityDamageEvent e) {
        if(e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onProjectileLaunch(final ProjectileLaunchEvent e) {
        if (e.getEntity().getShooter() instanceof Player) {
            final Player p = (Player)e.getEntity().getShooter();
            if (e.getEntity() instanceof EnderPearl) {
                final Projectile proj = e.getEntity();
                if (proj.getType() == EntityType.ENDER_PEARL) {
                    p.spigot().setCollidesWithEntities(false);
                    proj.setPassenger((Entity)p);
                }
            }
        }
    }
    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onEntityDismound(final EntityDismountEvent e) {
        if (e.getEntity() instanceof Player) {
            final Player p = (Player)e.getEntity();
            if (p != null && p.getVehicle() instanceof EnderPearl) {
                Entity pearl = p.getVehicle();
                ItemStack butt = new ItemStack(Material.ENDER_PEARL);
                ItemMeta buttMeta = butt.getItemMeta();
                buttMeta.setDisplayName(C.color("&2&lEnder Butt &7(Right Click)"));
                butt.setItemMeta(buttMeta);
                p.spigot().setCollidesWithEntities(true);
                p.eject();
                pearl.remove();
                p.getInventory().setItem(4, butt);
            }
        }
    }
}
