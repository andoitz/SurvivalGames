/*    */ package com.skitscape.survivalgames.commands;
/*    */ 
/*    */ import com.skitscape.survivalgames.SettingsManager;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class SetLobbySpawn
/*    */   implements SubCommand
/*    */ {
/*    */   public boolean onCommand(Player player, String[] args)
/*    */   {
/* 12 */     if ((!player.hasPermission("sg.lobby.set")) && (!player.isOp())) {
/* 13 */       player.sendMessage(ChatColor.RED + "No Permission");
/* 14 */       return true;
/*    */     }
/* 16 */     SettingsManager.getInstance().setLobbySpawn(player.getLocation());
/* 17 */     player.sendMessage(ChatColor.GREEN + "Lobby spawnpoint set!");
/* 18 */     return true;
/*    */   }
/*    */ 
/*    */   public String help(Player p)
/*    */   {
/* 23 */     return "/sg setlobbyspawn - Set the lobby spawn point";
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames\
 * Qualified Name:     com.skitscape.survivalgames.commands.SetLobbySpawn
 * JD-Core Version:    0.6.2
 */