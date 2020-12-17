package me.volcifire.foodhalfheart.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {
  
  @EventHandler
  public void PlayerEvent(PlayerItemConsumeEvent event) {
    
    ItemStack item = event.getItem();
    
    if (item.getType() != Material.POTION && item.getType() != Material.MILK_BUCKET) {
      event.getPlayer().setHealth(0.5);
    }
    
  }
  
}
