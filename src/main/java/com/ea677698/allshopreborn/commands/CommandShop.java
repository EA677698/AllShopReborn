package com.ea677698.allshopreborn.commands;

import com.ea677698.allshopreborn.main.AllShopReborn;
import com.ea677698.allshopreborn.utils.ConfigManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandShop implements CommandExecutor {


    private final AllShopReborn plugin;
    private ConfigManager configManager;

    public CommandShop(AllShopReborn plugin) {
        this.plugin = plugin;
        configManager = ConfigManager.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}
