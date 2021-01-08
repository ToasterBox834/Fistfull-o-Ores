
package net.mcreator.fistfuloores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.fistfuloores.itemgroup.FistfulOOresItemGroup;
import net.mcreator.fistfuloores.FistfulOOresModElements;

@FistfulOOresModElements.ModElement.Tag
public class ScopperPickaxeItem extends FistfulOOresModElements.ModElement {
	@ObjectHolder("fistful_o_ores:scopper_pickaxe")
	public static final Item block = null;
	public ScopperPickaxeItem(FistfulOOresModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ScopperIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(FistfulOOresItemGroup.tab)) {
		}.setRegistryName("scopper_pickaxe"));
	}
}
