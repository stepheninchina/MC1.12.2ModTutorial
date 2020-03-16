package com.example.examplemod.register;

import com.example.examplemod.common.item.ItemBubble;
import com.example.examplemod.common.item.Moditemslist;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemsRegister {

    public ItemsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                Moditemslist.ITEMS.toArray(new Item[0]));
    }
}

/*

使用数组统一注册，降低了代码率

*/
