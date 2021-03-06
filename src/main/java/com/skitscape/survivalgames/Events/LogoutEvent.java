package com.skitscape.survivalgames.Events;

import com.skitscape.survivalgames.Game;
import com.skitscape.survivalgames.GameManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LogoutEvent
  implements Listener
{
  @EventHandler
  public void PlayerLoggout(PlayerQuitEvent e)
  {
/* 16 */     Player p = e.getPlayer();
/* 17 */     GameManager.getInstance().removeFromOtherQueues(p, -1);
/* 18 */     int id = GameManager.getInstance().getPlayerGameId(p);
/* 19 */     if (id == -1) return;
/* 20 */     if (GameManager.getInstance().getGameMode(id) == Game.GameMode.INGAME)
/* 21 */       GameManager.getInstance().getGame(id).killPlayer(p, true);
    else
/* 23 */       GameManager.getInstance().getGame(id).removePlayer(p, true);
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.Events.LogoutEvent
 * JD-Core Version:    0.6.2
 */