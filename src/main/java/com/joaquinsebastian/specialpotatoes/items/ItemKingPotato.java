package com.joaquinsebastian.specialpotatoes.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;

public class ItemKingPotato extends ItemFood {

    public ItemKingPotato() {
        super(20, 1.0F, false);
        this.setUnlocalizedName("king_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":king_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.epic; // Nombre morado
    }

    // Si quieres que brille como encantada:
    @Override
    public boolean hasEffect(ItemStack stack, int pass) {
        return true;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 1));
            player.addPotionEffect(new PotionEffect(22, 2400, 3));
            player.addPotionEffect(new PotionEffect(23, 1, 0));
            player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1));
        }
        super.onFoodEaten(stack, world, player);
    }
}
