package com.ea677698.allshopreborn.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChestUI {

    private int pages;
    private int currentPage;
    private final Inventory page;

    public ChestUI(Player player, int pages, String title){
        page = Bukkit.createInventory(null, 54, title);
    }

    public void loadData(Entry[] entries){
        for (Entry entry : entries){
            page.setItem(entry.getSlot(), entry.getItem());
        }
    }

    public void openForPlayer(Player player) {
        player.openInventory(page);
    }

}
