package com.joaquinsebastian.specialpotatoes.items;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemIronPotato extends ItemFood {
    public ItemIronPotato() {
        super(6, 0.8F, false);
        this.setUnlocalizedName("iron_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":iron_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 3600, 1));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 3600, 0));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 3600, 1));
        }
        super.onFoodEaten(stack, world, player);
    }
}
