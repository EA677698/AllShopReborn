package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import com.ea677698.allshopreborn.shops.ServerShopMode;
import com.ea677698.allshopreborn.shops.Shop;
import com.ea677698.allshopreborn.utils.ConfigManager;
import com.ea677698.allshopreborn.utils.Listing;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandShop extends SharedCommand implements CommandExecutor {

    private ConfigManager configManager;

    public CommandShop(AllShopReborn plugin) {
        super(plugin, new Shop(new ServerShopMode()));
        configManager = ConfigManager.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("You must be a player to use this command!");
            return false;
        }

        if (strings.length == 0) {
            getShop().openInventory((Player) commandSender);
            return true;
        }

        if (strings[0].equalsIgnoreCase("sell")) {
            return sellItem((Player) commandSender, strings);
        }

        return false;
    }

    private boolean sellItem(Player player, String[] args) {
        if (args.length < 3) { // "sell" is still in args array
            player.sendMessage("Usage: /shop sell <amount> <price>");
            return false;
        }

        int amount;
        double price;

        try {
            amount = Integer.parseInt(args[1]);
            price = Float.parseFloat(args[2]);
        } catch (NumberFormatException e) {
            player.sendMessage("Invalid number format!");
            return false;
        }

        Listing listing = new Listing.Builder()
                .setSeller(player)
                .setAmount(amount)
                .setPrice((float) price)
                .build();


        getShop().addListing(listing);
        return true;
    }
}
