package com.devmaster.dangerzone.CreativeTabs;

import com.devmaster.dangerzone.misc.DangerZone;
import com.devmaster.dangerzone.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DangerZoneArmory extends ItemGroup {
    public DangerZoneArmory() {
        super("dangerzonearmory");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.COARSE_AMETHYST_CHESTPLATE.get());
    }

    @Override
    public boolean hasSearchBar() {
        return false;
    }


    @OnlyIn(Dist.CLIENT)
    @Override
    public ResourceLocation getBackgroundImage() {
        return new ResourceLocation(DangerZone.MOD_ID, "textures/gui/inventory_tab.png");
    }

    @Override
    public ResourceLocation getTabsImage() {
        return new ResourceLocation(DangerZone.MOD_ID, "textures/gui/tab_icons.png");
    }
}