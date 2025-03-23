package com.ea677698.allshopreborn.shops;

import com.ea677698.allshopreborn.utils.Listing;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Shop {

    private int pages;
    private int currentPage;
    private ShopMode mode;
    private Inventory page;

    public Shop(ShopMode mode){
        this.mode = mode;
        page = mode.createInventory();
    }

    public void changeMode(ShopMode mode) {
        this.mode = mode;
        this.page = mode.createInventory();;
    }

    public void addListing(Listing listing) {
        mode.addListing(listing);
    }

    public void openInventory(Player player) {
        mode.openInventory(player);
    }

    public void closeInventory(Player player) {
        mode.closeInventory(player);
    }

}
