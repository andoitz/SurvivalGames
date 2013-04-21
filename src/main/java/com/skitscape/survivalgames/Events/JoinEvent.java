package com.skitscape.survivalgames.Events;

import com.skitscape.survivalgames.GameManager;
import com.skitscape.survivalgames.SettingsManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class JoinEvent
  implements Listener
{
  Plugin plugin;

  public JoinEvent(Plugin plugin)
  {
/* 19 */     this.plugin = plugin;
  }

  @EventHandler
  public void PlayerJoin(PlayerJoinEvent e) {
/* 24 */     final Player p = e.getPlayer();
/* 25 */     if (GameManager.getInstance().getBlockGameId(p.getLocation()) != -1) {
/* 26 */       Bukkit.getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable() {
        public void run() {
/* 28 */           p.teleport(SettingsManager.getInstance().getLobbySpawn());
        }
      }
      , 5L);
    }
/* 33 */     if ((p.isOp()) || (p.hasPermission("sg.system.updatenotify"))) {
}   }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.Events.JoinEvent
 * JD-Core Version:    0.6.2
 */