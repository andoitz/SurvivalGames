/*    */ package com.skitscape.survivalgames.net;
/*    */ 
/*    */ import com.skitscape.survivalgames.SurvivalGames;
/*    */ import java.net.ServerSocket;
/*    */ import java.net.Socket;
/*    */ 
/*    */ public class Webserver extends Thread
/*    */ {
/*    */   public void run()
/*    */   {
/*    */     try
/*    */     {
/* 13 */       ServerSocket st = new ServerSocket(880);
/*    */ 
/* 15 */       while (SurvivalGames.isActive())
/*    */       {
/* 17 */         Socket skt = st.accept();
/*    */ 
/* 20 */         Connection c = new Connection(skt);
/* 21 */         c.start();
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 26 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.net.Webserver
 * JD-Core Version:    0.6.2
 */