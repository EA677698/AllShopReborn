package com.ea677698.allshopreborn.utils;

import com.ea677698.allshopreborn.main.AllShopReborn;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.ChatColor;
public class ConfigManager {

    private static ConfigManager instance;
    private AllShopReborn plugin;
    private FileConfiguration config;

    private int listingsLimit, expiration;
    private boolean digitalEnabled,
            auctionsEnabled,
            physicalEnabled,
            serverShopEnabled,
            tradingEnabled,
            debug,
            realTimeUpdates;
    private String serverPrefix;

    private ConfigManager() {
    }

    public void setPlugin(AllShopReborn plugin) {
        this.plugin = plugin;
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void loadConfig() {
        plugin.reloadConfig();
        config = plugin.getConfig();
        debug = config.getBoolean("debug");
        listingsLimit = config.getInt("shop-listings-limit");
        digitalEnabled = config.getBoolean("player-shop-enabled");
        physicalEnabled = config.getBoolean("chest-shop-enabled");
        serverShopEnabled = config.getBoolean("server-shop-enabled");
        tradingEnabled = config.getBoolean("trading-enabled");
        expiration = config.getInt("days-before-removal");
        realTimeUpdates = !config.getBoolean("real-time-shop-updates");
        auctionsEnabled = config.getBoolean("auctions-enabled");
        serverPrefix = config.getString("prefix");
        serverPrefix = ChatColor.translateAlternateColorCodes('&', serverPrefix);
    }

    public int getListingsLimit() {
        return listingsLimit;
    }

    public int getExpiration() {
        return expiration;
    }

    public boolean isDigitalEnabled() {
        return digitalEnabled;
    }

    public boolean areAuctionsEnabled() {
        return auctionsEnabled;
    }

    public boolean isPhysicalEnabled() {
        return physicalEnabled;
    }

    public boolean isServerShopEnabled() {
        return serverShopEnabled;
    }

    public boolean isTradingEnabled() {
        return tradingEnabled;
    }

    public boolean isDebugEnabled() {
        return debug;
    }

    public boolean areRealTimeUpdatesEnabled() {
        return realTimeUpdates;
    }

    public String getServerPrefix() {
        return serverPrefix;
    }


}
