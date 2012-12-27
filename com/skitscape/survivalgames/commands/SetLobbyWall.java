/*    */ package com.skitscape.survivalgames.commands;
/*    */ 
/*    */ import com.skitscape.survivalgames.LobbyManager;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class SetLobbyWall
/*    */   implements SubCommand
/*    */ {
/*    */   public boolean onCommand(Player player, String[] args)
/*    */   {
/* 16 */     if ((!player.hasPermission("sg.lobby.set")) && (!player.isOp())) {
/* 17 */       player.sendMessage(ChatColor.RED + "No Permission");
/* 18 */       return true;
/*    */     }
/* 20 */     LobbyManager.getInstance().setLobbySignsFromSelection(player);
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   public String help(Player p)
/*    */   {
/* 26 */     return "/sg setlobbywall - Setings the lobby stats wall";
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames\
 * Qualified Name:     com.skitscape.survivalgames.commands.SetLobbyWall
 * JD-Core Version:    0.6.2
 */