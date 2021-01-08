
package net.mcreator.fistfuloores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fistfuloores.itemgroup.FistfulOOresItemGroup;
import net.mcreator.fistfuloores.FistfulOOresModElements;

@FistfulOOresModElements.ModElement.Tag
public class ScopperIngotItem extends FistfulOOresModElements.ModElement {
	@ObjectHolder("fistful_o_ores:scopper_ingot")
	public static final Item block = null;
	public ScopperIngotItem(FistfulOOresModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FistfulOOresItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("scopper_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
