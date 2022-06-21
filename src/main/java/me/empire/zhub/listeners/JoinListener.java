package me.empire.zhub.listeners;

import me.empire.zhub.utils.ItemsAndLoadouts;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.setAllowFlight(true);
        ItemsAndLoadouts.hubStuff(p);
    }
}