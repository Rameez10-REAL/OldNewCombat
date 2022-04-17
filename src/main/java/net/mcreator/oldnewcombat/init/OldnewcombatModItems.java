
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oldnewcombat.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.oldnewcombat.item.OldwoodswordItem;
import net.mcreator.oldnewcombat.item.OldwoodaxeItem;
import net.mcreator.oldnewcombat.item.OldstoneaxeItem;
import net.mcreator.oldnewcombat.item.OldstoneItem;
import net.mcreator.oldnewcombat.item.OldnetherrightaxeItem;
import net.mcreator.oldnewcombat.item.OldnetherrightItem;
import net.mcreator.oldnewcombat.item.OldironswordItem;
import net.mcreator.oldnewcombat.item.OldironaxeItem;
import net.mcreator.oldnewcombat.item.OldgoldswordItem;
import net.mcreator.oldnewcombat.item.OldgoldaxeItem;
import net.mcreator.oldnewcombat.item.OlddiamondswordItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OldnewcombatModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OLDDIAMONDSWORD = register(new OlddiamondswordItem());
	public static final Item OLDWOODSWORD = register(new OldwoodswordItem());
	public static final Item OLDSTONE = register(new OldstoneItem());
	public static final Item OLDGOLDSWORD = register(new OldgoldswordItem());
	public static final Item OLDNETHERRIGHT = register(new OldnetherrightItem());
	public static final Item OLDWOODAXE = register(new OldwoodaxeItem());
	public static final Item OLDSTONEAXE = register(new OldstoneaxeItem());
	public static final Item OLDIRONSWORD = register(new OldironswordItem());
	public static final Item OLDIRONAXE = register(new OldironaxeItem());
	public static final Item OLDGOLDAXE = register(new OldgoldaxeItem());
	public static final Item OLDNETHERRIGHTAXE = register(new OldnetherrightaxeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
