
package net.mcreator.oldnewcombat.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OldwoodswordItem extends SwordItem {
	public OldwoodswordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_PLANKS), new ItemStack(Blocks.DARK_OAK_PLANKS), new ItemStack(Blocks.OAK_WOOD),
						new ItemStack(Blocks.DARK_OAK_WOOD));
			}
		}, 3, 6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("oldwoodsword");
	}
}
