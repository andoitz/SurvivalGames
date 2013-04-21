package com.skitscape.survivalgames.commands;

import com.skitscape.survivalgames.GameManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class LeaveQueue
  implements SubCommand
{
  public boolean onCommand(Player player, String[] args)
  {
/* 12 */     GameManager.getInstance().removeFromOtherQueues(player, -1);
/* 13 */     return true;
  }

  public String help(Player p)
  {
/* 18 */     return ChatColor.YELLOW + "/sg lq - " + ChatColor.AQUA + "Leave the queue for any queued games";
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.LeaveQueue
 * JD-Core Version:    0.6.2
 */