package me.empire.zhub.commands;

import me.empire.zhub.utils.C;
import me.empire.zhub.zHub;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("gm")) {
            if (!(sender instanceof Player))
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NotAPlayer")));
            }
            else
            {
                if(!player.hasPermission(zHub.getInstance().getConfig().getString("permissions.gamemode")))
                {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NoPermission")));
                }
                else
                {
                    if(args.length == 0)
                    {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.GamemodeUsage")));
                    }
                    if(args.length == 1)
                    {
                        if(args[0].equals("0"))
                        {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Survival"));
                        }
                        if(args[0].equals("1"))
                        {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Creative"));
                        }
                        if(args[0].equals("2"))
                        {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Adventure"));
                        }
                        if(args[0].equals("3"))
                        {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Spectator"));
                        }
                        if(args[0].equals("s"))
                        {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Survival"));
                        }
                        if(args[0].equals("c"))
                        {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Creative"));
                        }
                        if(args[0].equals("a"))
                        {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Adventure"));
                        }
                        if(args[0].equals("sp"))
                        {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Spectator"));
                        }
                        if(args[0].equals("survival"))
                        {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Survival"));
                        }
                        if(args[0].equals("creative"))
                        {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Creative"));
                        }
                        if(args[0].equals("adventure"))
                        {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Adventure"));
                        }
                        if(args[0].equals("spectator"))
                        {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Spectator"));
                        }
                    }
                }
            }
        }
        if(cmd.getName().equalsIgnoreCase("gms"))
        {
            if(sender.hasPermission(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("permissions.gamemode"))))
            {
                if (!(sender instanceof Player)){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NotAPlayer")));
                } else {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Survival"));
                }
            }
            else
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NoPermission")));
            }
        }
        if(cmd.getName().equalsIgnoreCase("gmc"))
        {
            if(sender.hasPermission(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("permissions.gamemode"))))
            {
                if (!(sender instanceof Player)){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NotAPlayer")));
                } else {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Creative"));
                }
            }
            else
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NoPermission")));
            }
        }
        if(cmd.getName().equalsIgnoreCase("gma"))
        {
            if(sender.hasPermission(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("permissions.gamemode"))))
            {
                if (!(sender instanceof Player)){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NotAPlayer")));
                } else {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Adventure"));
                }
            }
            else
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NoPermission")));
            }
        }
        if(cmd.getName().equalsIgnoreCase("gmsp"))
        {
            if(sender.hasPermission(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("permissions.gamemode"))))
            {
                if (!(sender instanceof Player)){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NotAPlayer")));
                } else {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.Gamemode")).replaceAll("%mode%", "Spectator"));
                }
            }
            else
            {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', zHub.getInstance().getConfig().getString("messages.NoPermission")));
            }
        }
        return true;
    }
}