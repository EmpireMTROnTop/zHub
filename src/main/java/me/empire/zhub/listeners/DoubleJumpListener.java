package me.empire.zhub.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJumpListener implements Listener {

    @EventHandler
    public void doubleJump(PlayerToggleFlightEvent e){
        Player player = e.getPlayer();
        if (!(player.getGameMode() == GameMode.SURVIVAL)) {
            return;
        }
        e.setCancelled(true);
        e.getPlayer().setVelocity(e.getPlayer().getLocation().getDirection().multiply(1.6d).setY(1.0d));
    }

//    @EventHandler
//    public void onDamageByBow(PlayerVelocityEvent e){
//        Player p = e.getPlayer();
//        Player a = e.getPlayer().getKiller();
//        if(a instanceof Player){
//            if(a.equals(p)){
//                if(a.getInventory().getItemInMainHand().equals(new ItemStack(Material.BOW)))
//                p.setVelocity(p.getLocation().getDirection().multiply(1.5d).setY(0.4d));
//            }
//        }
//    }
}
