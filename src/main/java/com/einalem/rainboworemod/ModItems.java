package com.einalem.rainboworemod;

import com.einalem.rainboworemod.items.RainbowIngotItem;
import com.einalem.rainboworemod.items.RainbowSwordItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowSwordItem.REGISTRY_NAME)
  public static RainbowSwordItem rainbowSwordItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowIngotItem.REGISTRY_NAME)
  public static RainbowIngotItem rainbowIngotItem;

  @SideOnly(Side.CLIENT)
  public static void initModels() {
    initModel(rainbowIngotItem);
    initModel(rainbowSwordItem);
  }

  @SideOnly(Side.CLIENT)
  private static void initModel(Item item) {
    ModelLoader.setCustomModelResourceLocation(
      item,
      0,
      new ModelResourceLocation(item.getRegistryName(), "inventory")
    );
  }
}
