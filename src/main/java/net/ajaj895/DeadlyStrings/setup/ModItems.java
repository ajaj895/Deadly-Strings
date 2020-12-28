package net.ajaj895.DeadlyStrings.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {

    public static final RegistryObject<Item> DANGER_STRING = Registration.ITEMS.register("danger_string", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

    static void register() {}
}
