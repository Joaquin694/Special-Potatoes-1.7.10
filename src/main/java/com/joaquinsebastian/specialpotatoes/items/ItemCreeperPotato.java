package com.joaquinsebastian.specialpotatoes.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.joaquinsebastian.specialpotatoes.SpecialPotatoes;

public class ItemCreeperPotato extends ItemFood {

    public ItemCreeperPotato() {
        super(1, 0.0F, false);
        this.setUnlocalizedName("creeper_potato");
        this.setTextureName(SpecialPotatoes.MODID + ":creeper_potato");
        this.setCreativeTab(SpecialPotatoes.tabSpecialPotatoes);
        this.setAlwaysEdible();
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.uncommon;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 1));
            world.createExplosion(player, player.posX, player.posY, player.posZ, 6.0F, false);
        }
        super.onFoodEaten(stack, world, player);
    }
}
