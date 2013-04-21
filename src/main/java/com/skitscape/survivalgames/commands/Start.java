package com.skitscape.survivalgames.commands;

import com.skitscape.survivalgames.GameManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Start
  implements SubCommand
{
  public boolean onCommand(Player player, String[] args)
  {
/* 16 */     if (!player.hasPermission("sg.arena.vote")) return false;
/* 17 */     int game = GameManager.getInstance().getPlayerGameId(player);
/* 18 */     if (game == -1) {
/* 19 */       player.sendMessage(ChatColor.RED + "Must be in a game!");
/* 20 */       return true;
    }

/* 23 */     GameManager.getInstance().getGame(GameManager.getInstance().getPlayerGameId(player)).vote(player);

/* 25 */     return true;
  }

  public String help(Player p)
  {
/* 30 */     return "/sg start - Votes to start the game";
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.Start
 * JD-Core Version:    0.6.2
 */