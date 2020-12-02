
package me.aternos.zaderlyl.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import me.aternos.zaderlyl.item.ItemBronzeIngot;
import me.aternos.zaderlyl.block.BlockBronzeOre;
import me.aternos.zaderlyl.ElementsZaderMod;

@ElementsZaderMod.ModElement.Tag
public class RecipeBronzeIngotFurnace extends ElementsZaderMod.ModElement {
	public RecipeBronzeIngotFurnace(ElementsZaderMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBronzeOre.block, (int) (1)), new ItemStack(ItemBronzeIngot.block, (int) (1)), 10F);
	}
}
