
package me.aternos.zaderlyl.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import me.aternos.zaderlyl.item.ItemCrystal;
import me.aternos.zaderlyl.ElementsZaderMod;

@ElementsZaderMod.ModElement.Tag
public class TabExcadiat extends ElementsZaderMod.ModElement {
	public TabExcadiat(ElementsZaderMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabexcadiat") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCrystal.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
