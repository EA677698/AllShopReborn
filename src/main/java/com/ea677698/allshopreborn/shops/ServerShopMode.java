package com.ea677698.allshopreborn.shops;

import com.ea677698.allshopreborn.utils.Entry;
import com.ea677698.allshopreborn.utils.Listing;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ServerShopMode implements ShopMode{

    @Override
    public Inventory createInventory() {
        return Bukkit.createInventory(null, 54, "Server Shop");
    }

    @Override
    public void openInventory(Player player) {

    }

    @Override
    public void addListing(Listing listing) {

    }

    @Override
    public void loadData(Entry[] entries) {

    }

    @Override
    public void closeInventory(Player player) {

    }
}
