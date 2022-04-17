
package net.mcreator.oldnewcombat.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class OldgoldaxeItem extends PickaxeItem {
	public OldgoldaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 25;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("oldgoldaxe");
	}
}
