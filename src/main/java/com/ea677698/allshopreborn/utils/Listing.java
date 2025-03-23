package com.ea677698.allshopreborn.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.time.LocalDateTime;
import java.util.UUID;

public record Listing(int id, UUID uuid, Player seller, float price, int amount, ItemStack item, float minBid,
                      float bid, String bidder, LocalDateTime date) {

    public static class Builder {
        private int id;
        private UUID uuid;
        private Player seller;
        private float price;
        private int amount;
        private ItemStack item;
        private float minBid;
        private float bid;
        private String bidder;
        private LocalDateTime date;

        public Builder() {
            this.id = 0;
            this.uuid = UUID.randomUUID();
            this.seller = null;
            this.price = 0;
            this.amount = 0;
            this.item = null;
            this.minBid = 0;
            this.bid = 0;
            this.bidder = null;
            this.date = LocalDateTime.now();
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setSeller(Player seller) {
            this.seller = seller;
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder setItem(ItemStack item) {
            this.item = item;
            return this;
        }

        public Builder setMinBid(float minBid) {
            this.minBid = minBid;
            return this;
        }

        public Builder setBid(float bid) {
            this.bid = bid;
            return this;
        }

        public Builder setBidder(String bidder) {
            this.bidder = bidder;
            return this;
        }

        public Builder setDate(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Listing build() {
            return new Listing(id, uuid, seller, price, amount, item, minBid, bid, bidder, date);
        }
    }
}
