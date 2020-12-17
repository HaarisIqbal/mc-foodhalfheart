package me.volcifire.foodhalfheart;

import org.bukkit.plugin.java.JavaPlugin;
import me.volcifire.foodhalfheart.listeners.Listeners;

public class Main extends JavaPlugin {

  private static Main instance;
  
  public static Main getInstance() {
    return instance;
  }
  
  @Override
  public void onEnable() {
    instance = this;
    getServer().getPluginManager().registerEvents(new Listeners(), this);
  }
  
  @Override
  public void onDisable() {
    instance = null;
  }
  
}
