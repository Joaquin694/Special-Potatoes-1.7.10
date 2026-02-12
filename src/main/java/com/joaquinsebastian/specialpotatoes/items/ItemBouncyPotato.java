package com.joaquinsebastian.specialpotatoes.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;

public class ItemBouncyPotato extends ItemFood {

    public ItemBouncyPotato() {
        super(3, 0.3F, false);
        this.setUnlocalizedName("bouncy_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":bouncy_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 3));
        }
        super.onFoodEaten(stack, world, player);
    }
}
