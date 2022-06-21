package me.empire.zhub.listeners;

import me.empire.zhub.utils.C;
import me.empire.zhub.zHub;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class AntiEvents implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if(!p.hasPermission("zhub.place")){
            e.setCancelled(true);
            C.message(p, zHub.getInstance().getConfig().getString("Messages.Anti-Block-Place"));
        } else {
            return;
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if(!p.hasPermission("zhub.break")){
            e.setCancelled(true);
            C.message(p, zHub.getInstance().getConfig().getString("Messages.Anti-Block-Break"));
        } else {
            return;
        }
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        Player p = e.getPlayer();
        C.message(p, zHub.getInstance().getConfig().getString("Messages.Anti-Drop"));
        e.setCancelled(true);
    }

    @EventHandler
    public void onPickup(PlayerPickupItemEvent e){
        Player p = e.getPlayer();
        if(!p.hasPermission("zhub.staff")){
            C.message(p, zHub.getInstance().getConfig().getString("Messages.Anti-Pickup"));
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onHungerChange(FoodLevelChangeEvent e){
        Player p = (Player) e.getEntity();
        e.setCancelled(true);
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e){
        e.setCancelled(true);
    }

    @EventHandler
    public void onMobSpawning(EntitySpawnEvent e){
        e.setCancelled(true);
    }
}
