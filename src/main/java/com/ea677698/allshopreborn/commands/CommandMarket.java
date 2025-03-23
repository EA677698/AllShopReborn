package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import com.ea677698.allshopreborn.shops.PlayerShopMode;
import com.ea677698.allshopreborn.shops.Shop;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMarket extends SharedCommand implements CommandExecutor {

    public CommandMarket(AllShopReborn plugin) {
        super(plugin, new Shop(new PlayerShopMode()));
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}
