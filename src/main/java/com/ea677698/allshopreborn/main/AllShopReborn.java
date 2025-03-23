package com.ea677698.allshopreborn.main;

import com.ea677698.allshopreborn.commands.*;
import com.ea677698.allshopreborn.shops.Shop;
import com.ea677698.allshopreborn.utils.ConfigManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class AllShopReborn extends JavaPlugin {

    private static Economy econ = null;

    private static final String PLUGIN_PREFIX = ChatColor.GREEN + "[AllShopReborn] " + ChatColor.RESET;

    private ConfigManager configManager;


    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            getLogger().severe("Disabling due to no Vault dependency found!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        configManager = ConfigManager.getInstance();
        configManager.setPlugin(this);
        configManager.loadConfig();
        this.getCommand("allShop").setExecutor(new CommandAllShop(this));
        this.getCommand("auction").setExecutor(new CommandAuction(this));
        this.getCommand("market").setExecutor(new CommandMarket(this));
        this.getCommand("shop").setExecutor(new CommandShop(this));
        this.getCommand("trade").setExecutor(new CommandTrade(this));

    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public static Economy getEconomy() {
        return econ;
    }

    public static String getPluginPrefix(){
        return PLUGIN_PREFIX;
    }

    @Override
    public void onDisable() {
        getLogger().info("Successfully shut down!");
    }
}
