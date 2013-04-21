package com.skitscape.survivalgames.commands;

import com.skitscape.survivalgames.SettingsManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ResetSpawns
  implements SubCommand
{
  public boolean onCommand(Player player, String[] args)
  {
/* 12 */     if ((!player.hasPermission("sg.arena.resetspawns")) && (!player.isOp())) {
/* 13 */       player.sendMessage(ChatColor.RED + "No Permission");
/* 14 */       return true;
    }
/* 16 */     SettingsManager.getInstance().getSpawns().set("spawns." + Integer.parseInt(args[0]), null);
/* 17 */     return true;
  }

  public String help(Player p)
  {
/* 22 */     return "/sg resetspawns <id> - resets spawns for an arena";
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.ResetSpawns
 * JD-Core Version:    0.6.2
 */