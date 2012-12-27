/*    */ package com.skitscape.survivalgames.Events;
/*    */ 
/*    */ import com.skitscape.survivalgames.LobbyManager;
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashSet;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.world.ChunkUnloadEvent;
/*    */ 
/*    */ public class KeepLobbyLoadedEvent
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onChunkUnload(ChunkUnloadEvent e)
/*    */   {
/* 13 */     if (LobbyManager.getInstance().lobbychunks.contains(e.getChunk())) {
/* 14 */       System.out.println("SG - STOPPED LOBBY CHUNK FROM UNLOADING!");
/* 15 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames\
 * Qualified Name:     com.skitscape.survivalgames.Events.KeepLobbyLoadedEvent
 * JD-Core Version:    0.6.2
 */