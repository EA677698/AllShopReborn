package com.ea677698.allshopreborn.shops;

import com.ea677698.allshopreborn.utils.Entry;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PlayerShopMode implements ShopMode{

    @Override
    public Inventory createInventory() {
        return Bukkit.createInventory(null, 54, "Player Shop");
    }

    @Override
    public void openInventory(Player player) {

    }

    @Override
    public void loadData(Entry[] entries) {

    }

    @Override
    public void closeInventory(Player player) {

    }
}
