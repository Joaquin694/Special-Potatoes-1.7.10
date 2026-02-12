package com.joaquinsebastian.specialpotatoes.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;

public class MinerPotato extends ItemFood {

    public MinerPotato() {

        super(4, 0.4F, false);

        this.setUnlocalizedName("miner_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":miner_potato"); // Textura
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {

            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 3600, 1));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 3600, 0));
        }

        super.onFoodEaten(stack, world, player);
    }

}
