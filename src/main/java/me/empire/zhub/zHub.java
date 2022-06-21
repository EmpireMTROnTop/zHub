package me.empire.zhub;

import me.empire.zhub.commands.GamemodeCommand;
import me.empire.zhub.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class zHub extends JavaPlugin {

    private static zHub instance;

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        registerConfig();
        registerListeners();
        start();
    }

    @Override
    public void onDisable() {
        shutdown();
    }

    public static void ConsoleM(String text){
        System.out.println(text);
    }

    private void registerCommands(){
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("gmc").setExecutor(new GamemodeCommand());
        getCommand("gms").setExecutor(new GamemodeCommand());
        getCommand("gma").setExecutor(new GamemodeCommand());
        getCommand("gmsp").setExecutor(new GamemodeCommand());
    }

    private void registerListeners(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new AntiEvents(), this);
        pm.registerEvents(new JoinListener(), this);
        pm.registerEvents(new DoubleJumpListener(), this);
        pm.registerEvents(new ClickListener(), this);
    }

    private void start(){
        ConsoleM("Starting zHub....");
        ConsoleM("zHub has been enabled!");
    }

    private void shutdown(){
        ConsoleM("Shutting zHub down...");
        ConsoleM("zHub has been disabled!");
    }

    private void registerConfig(){
        File config = new File(getDataFolder() + File.separator + "config.yml");
        if (!config.exists()) {
            getLogger().info("Creating new config.yml file...");
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
        }
    }

    public static zHub getInstance(){ return instance; }
}
