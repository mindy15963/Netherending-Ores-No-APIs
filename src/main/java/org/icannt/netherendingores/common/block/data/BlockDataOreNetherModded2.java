package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 28/01/19.
 */
public enum BlockDataOreNetherModded2 implements IStringSerializable {
	
	
    ZINC_ORE ("zinc_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    RUBY_ORE ("ruby_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    SAPPHIRE_ORE ("sapphire_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    PERIDOT_ORE ("peridot_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    ELECTROTINE_ORE ("electrotine_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    AMBROSIUM_ORE ("ambrosium_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    GRAVITITE_ORE ("gravitite_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    ZANITE_ORE ("zanite_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    ARKENIUM_ORE ("arkenium_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    ICESTONE_ORE ("icestone_ore", 0, 1, 3, 15, EnumRarity.COMMON);


    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;

    BlockDataOreNetherModded2(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity) {

        this.name = name;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getLight() {
        return light;
    }
    
    public int getHarvestLevel() {
        return harvestLevel;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }
    
    public EnumRarity getRarity() {
        return rarity;
    }
    
}
