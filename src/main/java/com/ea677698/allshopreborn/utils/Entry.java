package com.ea677698.allshopreborn.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Entry {

    private final static int RANDOM_SLOT = -1;

    private final ItemStack item;
    private final double price;
    private final int amount;
    private final int slot;

    public static class Builder {
        private ItemStack item;
        private String name;
        private double price;
        private int amount;
        private int slot;
        private ItemMeta meta;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder() {
            item = null;
            price = 0;
            amount = 1;
            slot = RANDOM_SLOT;
            meta = Bukkit.getItemFactory().getItemMeta(item.getType());
        }

        public Builder item(ItemStack item) {
            this.item = item;
            meta = item.getItemMeta();
            return this;
        }

        public Builder name(String name) {
            meta.setDisplayName(name);
            return this;
        }

        public Builder lore(List<String> lore) {
            meta.setLore(lore);
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder slot(int slot) {
            this.slot = slot;
            return this;
        }

        public Entry build() {
            if(item == null) {
                item = new ItemStack(Material.AIR, 1);
            }
            return new Entry(this);
        }

    }

    private Entry(Builder builder) {
        this.item = builder.item;
        this.price = builder.price;
        this.amount = builder.amount;
        this.slot = builder.slot;
    }

    public ItemStack getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getSlot() {
        return slot;
    }

}
