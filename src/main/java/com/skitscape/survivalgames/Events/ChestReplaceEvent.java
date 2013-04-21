package com.skitscape.survivalgames.Events;

import com.skitscape.survivalgames.Game;
import com.skitscape.survivalgames.GameManager;
import com.skitscape.survivalgames.util.ChestRatioStorage;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.DoubleChest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ChestReplaceEvent
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGHEST)
  public void ChestListener(PlayerInteractEvent e)
  {
    try
    {
/* 28 */       HashSet<Block> openedChest3 = new HashSet<Block>();

/* 30 */       if (e.getAction() != Action.RIGHT_CLICK_BLOCK) return;

/* 32 */       Block clickedBlock = e.getClickedBlock();
/* 33 */       int gameid = GameManager.getInstance().getPlayerGameId(e.getPlayer());
/* 34 */       if (gameid == -1) return;
/* 35 */       GameManager gm = GameManager.getInstance();

/* 37 */       if (!gm.isPlayerActive(e.getPlayer())) {
/* 38 */         return;
      }

/* 41 */       if (gm.getGame(gameid).getMode() != Game.GameMode.INGAME) {
/* 42 */         return;
      }

/* 45 */       if (GameManager.openedChest.get(Integer.valueOf(gameid)) != null) {
/* 46 */         openedChest3.addAll((Collection<Block>)GameManager.openedChest.get(Integer.valueOf(gameid)));
      }

/* 49 */       if (openedChest3.contains(clickedBlock)) {
/* 50 */         return;
      }

/* 54 */       int size = 0;
      Inventory inv;
/* 56 */       if ((clickedBlock.getState() instanceof Chest)) {
/* 57 */         size = 1;
/* 58 */         inv = ((Chest)clickedBlock.getState()).getInventory();
      }
      else
      {
/* 61 */         if ((clickedBlock.getState() instanceof DoubleChest)) {
/* 62 */           size = 2;
/* 63 */           inv = ((DoubleChest)clickedBlock.getState()).getInventory();
        }
        else
        {
          return;
        }
      }
/* 68 */       inv.clear();
/* 69 */       Random r = new Random();

/* 71 */       for (ItemStack i : ChestRatioStorage.getInstance().getItems()) {
/* 72 */         int l = r.nextInt(26 * size);

/* 74 */         while (inv.getItem(l) != null)
/* 75 */           l = r.nextInt(26 * size);
/* 76 */         inv.setItem(l, i);
      }

/* 80 */       openedChest3.add(clickedBlock);
/* 81 */       GameManager.openedChest.put(Integer.valueOf(gameid), openedChest3);
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.Events.ChestReplaceEvent
 * JD-Core Version:    0.6.2
 */