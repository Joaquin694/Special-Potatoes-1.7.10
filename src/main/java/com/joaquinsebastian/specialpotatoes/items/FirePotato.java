package com.joaquinsebastian.specialpotatoes.items;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FirePotato extends ItemFood {
    public FirePotato(){
        super(6, 0.8F, false);
        this.setUnlocalizedName("fire_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":fire_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1200, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 1));

            if (player.isBurning()) {
                player.extinguish();
            }
        }
    }
}
