
package me.aternos.zaderlyl.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import me.aternos.zaderlyl.ElementsZaderMod;

@ElementsZaderMod.ModElement.Tag
public class ItemBronzeArmor extends ElementsZaderMod.ModElement {
	@GameRegistry.ObjectHolder("zadermod:bronzearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("zadermod:bronzearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("zadermod:bronzearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("zadermod:bronzearmorboots")
	public static final Item boots = null;
	public ItemBronzeArmor(ElementsZaderMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BRONZEARMOR", "zadermod:bronze", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bronzearmorhelmet")
				.setRegistryName("bronzearmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bronzearmorbody")
				.setRegistryName("bronzearmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("bronzearmorlegs")
				.setRegistryName("bronzearmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("bronzearmorboots")
				.setRegistryName("bronzearmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("zadermod:bronzearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("zadermod:bronzearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("zadermod:bronzearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("zadermod:bronzearmorboots", "inventory"));
	}
}
