package com.christmas.lookingatplayers.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static com.christmas.lookingatplayers.managers.Targeter.getTargetPlayer;

public class PlayerInteractListener implements Listener {
    public void onInteract(PlayerInteractEvent e){
        if(e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            Player p = e.getPlayer(); // This gives you the player that actually DOES THE EVENT
            if(p.getInventory().getItemInMainHand().getType().equals(Material.CARROT_ON_A_STICK)){
                Player targetP = getTargetPlayer(p);
                targetP.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100, 1));
            }
        }
    }
}
