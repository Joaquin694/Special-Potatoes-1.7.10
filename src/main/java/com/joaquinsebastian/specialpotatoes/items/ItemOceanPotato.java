package com.joaquinsebastian.specialpotatoes.items;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemOceanPotato extends ItemFood {
    public ItemOceanPotato() {
        super(5, 0.6F, false);
        this.setUnlocalizedName("ocean_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":ocean_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 3600, 0));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 3600, 0));
        }
        super.onFoodEaten(stack, world, player);
    }
}
