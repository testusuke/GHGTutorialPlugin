package net.testusuke.ghgtutorialplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class EnchantmentCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public EnchantmentCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You can not use console!");
            return false;
        }

        if(args.length == 0){
            Player player = (Player)sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lKitz &c» &eYou've succesfully obtained &cKit Starter&e!"));

            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
            ItemMeta swordMeta = sword.getItemMeta();

            swordMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5&lGod Sword"));
            ArrayList<String> lore = new ArrayList<>();
            lore.add("&7Sword forged in the fires of hell.");
            lore.add("&c&kkkdkdkdkdkdkdkdkkdkdkddkdkdkdkdk");
            swordMeta.setLore(lore);
            sword.setItemMeta(swordMeta);

            ItemStack food = new ItemStack(Material.GRILLED_PORK, 32);

            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
            helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
            chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
            leggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
            boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            player.getInventory().addItem(sword);
            player.getInventory().addItem(food);
            player.getInventory().setHelmet(helmet);
            player.getInventory().setChestplate(chestplate);
            player.getInventory().setLeggings(leggings);
            player.getInventory().setBoots(boots);
        }
        return false;
    }
}
