package com.example.examplemod.common.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBubble extends Item {
    public ItemBubble(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
