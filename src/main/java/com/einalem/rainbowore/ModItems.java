package com.einalem.rainbowore;

import com.einalem.rainbowore.items.*;
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

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowShovelItem.REGISTRY_NAME)
  public static RainbowShovelItem rainbowShovelItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowHoeItem.REGISTRY_NAME)
  public static RainbowHoeItem rainbowHoeItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowPickaxeItem.REGISTRY_NAME)
  public static RainbowPickaxeItem rainbowPickaxeItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowAxeItem.REGISTRY_NAME)
  public static RainbowAxeItem rainbowAxeItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowHelmItem.REGISTRY_NAME)
  public static RainbowHelmItem rainbowHelmItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowChestplateItem.REGISTRY_NAME)
  public static RainbowChestplateItem rainbowChestplateItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowLeggingsItem.REGISTRY_NAME)
  public static RainbowLeggingsItem rainbowLeggingsItem;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowBootsItem.REGISTRY_NAME)
  public static RainbowBootsItem rainbowBootsItem;

  @SideOnly(Side.CLIENT)
  public static void initModels() {
    initModel(rainbowIngotItem);

    initModel(rainbowSwordItem);
    initModel(rainbowShovelItem);
    initModel(rainbowHoeItem);
    initModel(rainbowPickaxeItem);
    initModel(rainbowAxeItem);

    initModel(rainbowHelmItem);
    initModel(rainbowChestplateItem);
    initModel(rainbowLeggingsItem);
    initModel(rainbowBootsItem);
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
