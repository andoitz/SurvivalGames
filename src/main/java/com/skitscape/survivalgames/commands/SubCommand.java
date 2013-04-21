package com.skitscape.survivalgames.commands;

import org.bukkit.entity.Player;

public abstract interface SubCommand
{
  public abstract boolean onCommand(Player paramPlayer, String[] paramArrayOfString);

  public abstract String help(Player paramPlayer);
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.SubCommand
 * JD-Core Version:    0.6.2
 */