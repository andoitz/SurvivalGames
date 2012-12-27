/*    */ package com.skitscape.survivalgames.commands;
/*    */ 
/*    */ import com.skitscape.survivalgames.GameManager;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Leave
/*    */   implements SubCommand
/*    */ {
/*    */   public boolean onCommand(Player player, String[] args)
/*    */   {
/* 11 */     if (GameManager.getInstance().getPlayerGameId(player) == -1) {
/* 12 */       player.sendMessage(ChatColor.RED + "Not in a game!");
/*    */     }
/*    */     else {
/* 15 */       GameManager.getInstance().removePlayer(player, false);
/*    */     }
/* 17 */     return true;
/*    */   }
/*    */ 
/*    */   public String help(Player p)
/*    */   {
/* 22 */     return "/sg leave - Leaves the game";
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.commands.Leave
 * JD-Core Version:    0.6.2
 */