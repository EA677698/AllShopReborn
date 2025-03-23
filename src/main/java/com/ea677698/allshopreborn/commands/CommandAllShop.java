package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandAllShop extends SharedCommand implements CommandExecutor {

    public CommandAllShop(AllShopReborn plugin) {
        super(plugin, null);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(AllShopReborn.getPluginPrefix() + "Hello, World!");
        return false;
    }
}
