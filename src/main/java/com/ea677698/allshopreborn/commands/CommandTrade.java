package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTrade implements CommandExecutor {

    private final AllShopReborn plugin;

    public CommandTrade(AllShopReborn plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}
