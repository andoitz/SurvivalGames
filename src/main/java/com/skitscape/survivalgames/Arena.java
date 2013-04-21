package com.skitscape.survivalgames;

import org.bukkit.Location;

public class Arena
{
  Location min;
  Location max;

  public Arena(Location min, Location max)
  {
/* 12 */     this.max = max;
/* 13 */     this.min = min;
  }

  public boolean containsBlock(Location v)
  {
/* 18 */     if (v.getWorld() != this.min.getWorld())
/* 19 */       return false;
/* 20 */     double x = v.getX();
/* 21 */     double y = v.getY();
/* 22 */     double z = v.getZ();

/* 25 */     return (x >= this.min.getBlockX()) && (x < this.max.getBlockX() + 1) && 
/* 24 */       (y >= this.min.getBlockY()) && (y < this.max.getBlockY() + 1) && 
/* 25 */       (z >= this.min.getBlockZ()) && (z < this.max.getBlockZ() + 1);
  }

  public Location getMax()
  {
/* 31 */     return this.max;
  }

  public Location getMin() {
/* 35 */     return this.min;
  }
}

/* Location:           C:\Users\SUPERCOMPUTER\Desktop\SGAMESCONFIG1\SurvivalGames_B_0.4.10 (1)\SurvivalGames B 0.4.10\jd-gui-0.3.5.windows\SurvivalGames (2)\
 * Qualified Name:     com.skitscape.survivalgames.Arena
 * JD-Core Version:    0.6.2
 */