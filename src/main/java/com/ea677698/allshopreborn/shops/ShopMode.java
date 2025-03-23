package com.ea677698.allshopreborn.shops;

import com.ea677698.allshopreborn.utils.Entry;
import com.ea677698.allshopreborn.utils.Listing;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public interface ShopMode {

    Inventory createInventory();
    void openInventory(Player player);
    // void handleItemClick(InventoryClickEvent event);
    void addListing(Listing listing);
    void loadData(Entry[] entries);
    void closeInventory(Player player);

}
