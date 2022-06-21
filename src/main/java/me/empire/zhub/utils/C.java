package me.empire.zhub.utils;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public class C {

    public static String color(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static void message(Player To, String message){
        To.sendMessage(color(message));
    }
}
