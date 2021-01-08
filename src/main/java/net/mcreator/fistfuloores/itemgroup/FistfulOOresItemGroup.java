
package net.mcreator.fistfuloores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fistfuloores.block.RubyOreBlock;
import net.mcreator.fistfuloores.FistfulOOresModElements;

@FistfulOOresModElements.ModElement.Tag
public class FistfulOOresItemGroup extends FistfulOOresModElements.ModElement {
	public FistfulOOresItemGroup(FistfulOOresModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfistful_o_ores") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
