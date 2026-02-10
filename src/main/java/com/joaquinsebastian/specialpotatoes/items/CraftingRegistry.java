package com.joaquinsebastian.specialpotatoes.items;

import com.joaquinsebastian.specialpotatoes.CommonProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRegistry {

    public static void registerRecipes() {

        // --- 1. PATATA MINERA ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.minerPotato, 1), new Object[]{
            " G ",
            "GPG",
            " G ",
            'P', Items.baked_potato,
            'G', Items.coal
        });

        // --- 2. PATATA REBOTADORA ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.bouncyPotato, 1), new Object[]{
            " F ",
            "SPS",
            " F ",
            'P', Items.baked_potato,
            'S', Items.slime_ball,
            'F', Items.feather
        });

        // --- 3. PATATA DE HIERRO ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.ironPotato, 1), new Object[]{
            " I ",
            "IPI",
            " I ",
            'P', Items.baked_potato,
            'I', Items.iron_ingot
        });

        // --- 4. PATATA CREEPER ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.creeperPotato, 2), new Object[]{ // Crea 2 patatas
            " G ",
            "GPG",
            " G ",
            'P', Items.baked_potato,
            'G', Items.gunpowder
        });

        // --- 5. PATATA OCEÁNICA ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.oceanPotato, 1), new Object[]{
            " T ",
            "FPF",
            " T ",
            'P', Items.baked_potato,
            'F', new ItemStack(Items.fish, 1, 3), // Pez Globo (Pufferfish)
            'T', Items.water_bucket
        });

        // --- 6. PATATA SUPREMA (KING) ---
        GameRegistry.addRecipe(new ItemStack(CommonProxy.kingPotato, 1), new Object[]{
            " G ",
            "GPG",
            " G ",
            'P', CommonProxy.ironPotato,
            'G', Items.gold_ingot
        });
    }
}
