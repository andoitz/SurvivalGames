/*    */ package com.skitscape.survivalgames.commands;
/*    */ 
/*    */ import com.skitscape.survivalgames.stats.StatsWallManager;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class SetStatsWall
/*    */   implements SubCommand
/*    */ {
/*    */   public boolean onCommand(Player player, String[] args)
/*    */   {
/* 13 */     StatsWallManager.getInstance().setStatsSignsFromSelection(player);
/* 14 */     return false;
/*    */   }
/*    */ 
/*    */   public String help()
/*    */   {
/* 19 */     return "/sg setstatswall - Sets the stats wall";
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.SetStatsWall
 * JD-Core Version:    0.6.2
 */