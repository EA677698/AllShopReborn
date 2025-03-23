package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import com.ea677698.allshopreborn.shops.Shop;

public abstract class SharedCommand {

    private final AllShopReborn plugin;
    private final Shop shop;

    public SharedCommand(AllShopReborn plugin, Shop shop) {
        this.plugin = plugin;
        this.shop = shop;
    }

    public AllShopReborn getPlugin() {
        return plugin;
    }

    public Shop getShop() {
        return shop;
    }

}
