
package net.mcreator.oldnewcombat.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OldgoldswordItem extends SwordItem {
	public OldgoldswordItem() {
		super(new Tier() {
			public int getUses() {
				return 25;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("oldgoldsword");
	}
}
