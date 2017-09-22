package com.game.Mount.Kabru.beans.enums;

import oracle.jdbc.proxy.annotation.Pre;

public enum Prefix {

    //list out all the prefixes that will be used
    //+strength, 5 of each
        bear("of the bear",5,0,0,0,0,0,0);

    //+mana

    //+attack

    //+spell Attack

    //+Max hp

    //+defense

    //+sell value

    //  ?? chance to find gold ??
    //  ?? additional factors  ??

    private final String name;
    private final Integer strengthValue;
    private final Integer manaValue;
    private final Integer attackValue;
    private final Integer spellAttackValue;
    private final Integer healthValue;
    private final Integer defenseValue;
    private final Integer sellValue;

    Prefix(String name, Integer strengthValue, Integer manaValue, Integer attackValue, Integer spellAttackValue, Integer healthValue, Integer defenseValue, Integer sellValue) {
        this.name = name;
        this.strengthValue = strengthValue;
        this.manaValue = manaValue;
        this.attackValue = attackValue;
        this.spellAttackValue = spellAttackValue;
        this.healthValue = healthValue;
        this.defenseValue = defenseValue;
        this.sellValue = sellValue;
    }

    public String getName() {
        return name;
    }

    public Integer getStrengthValue() {
        return strengthValue;
    }

    public Integer getManaValue() {
        return manaValue;
    }

    public Integer getAttackValue() {
        return attackValue;
    }

    public Integer getSpellAttackValue() {
        return spellAttackValue;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public Integer getDefenseValue() {
        return defenseValue;
    }

    public Integer getSellValue() {
        return sellValue;
    }

    @Override
    public String toString() {
        return "Prefix{" +
                "name='" + name + '\'' +
                ", strengthValue=" + strengthValue +
                ", manaValue=" + manaValue +
                ", attackValue=" + attackValue +
                ", spellAttackValue=" + spellAttackValue +
                ", healthValue=" + healthValue +
                ", defenseValue=" + defenseValue +
                ", sellValue=" + sellValue +
                '}';
    }
}
