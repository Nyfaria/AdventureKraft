package net.Akio.CraftZone.Main.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;



public class Emerald_Hoe extends ItemHoe{
	
	public Emerald_Hoe(ToolMaterial material) {
	    super(material);
	     this.maxStackSize = 1;
	     setMaxDamage(1300);
	     setCreativeTab(CreativeTabs.tabTools);
	   }
	
       public int getDamageVsEntity(Entity par1Entity) {
       return 5;
       }
     
       
       public String getMaterialName() {
      return "Emerald";
       }

}