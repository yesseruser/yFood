package io.itch.yesseruser.yfood.item;

import io.itch.yesseruser.yfood.YFood;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = YFood.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCMTabs {
    public static CreativeModeTab TEST_TAB;

    @SubscribeEvent
    public  static void registerCMTabs(CreativeModeTabEvent.Register event){
        TEST_TAB = event.registerCreativeModeTab(new ResourceLocation(YFood.MODID, "test_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
                        .title(Component.translatable("creativemodetab.test_tab")));
    }
}
