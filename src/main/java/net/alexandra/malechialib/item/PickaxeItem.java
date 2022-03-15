package net.alexandra.malechialib.item;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class PickaxeItem extends MiningToolItem {
    public PickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super((int) attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}