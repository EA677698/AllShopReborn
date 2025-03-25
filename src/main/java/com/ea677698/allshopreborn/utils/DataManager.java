package com.ea677698.allshopreborn.utils;

import com.ea677698.allshopreborn.main.AllShopReborn;

public class DataManager {

    public static DataManager instance;

    private AllShopReborn plugin;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void writeListing(Listing listing) {
    }

    public void setPlugin(AllShopReborn plugin) {
        this.plugin = plugin;
        plugin.saveResource("data.yml", false);
    }


}
