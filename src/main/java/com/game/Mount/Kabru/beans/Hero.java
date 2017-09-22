package com.game.Mount.Kabru.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

@Entity
@Table(name="ACTOR")
public class Hero extends Actor implements  Serializable  {

    private Integer heroId;
    private String heroName;
    private String heroClassType;
    private Integer levelOfHero;
    private Integer xpToNextLevel;
    private Integer experience;
    private Integer mana;
    private Integer strength;
 
    private Location currentLocation;
    private Actor foundMonster;
    private Player player;
    private ArrayList inventory;

    public Hero() {
        
    }

    public Hero(Integer heroId, String heroName, String heroClassType, Integer levelOfHero, Integer xpToNextLevel, Integer experience, Integer mana, Integer strength, Location currentLocation, Actor foundMonster, Player player, ArrayList inventory) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.heroClassType = heroClassType;
        this.levelOfHero = levelOfHero;
        this.xpToNextLevel = xpToNextLevel;
        this.experience = experience;
        this.mana = mana;
        this.strength = strength;
        this.currentLocation = currentLocation;
        this.foundMonster = foundMonster;
        this.player = player;
        this.inventory = inventory;
    }

    public Hero(Integer actorId, String name, Integer maxHitPoints, Integer currentHitPoints, Integer defense, Integer attack, Integer spellAttack, Integer xpGained, Integer gold, Event[] randomEvent, Game game, Integer heroId, String heroName, String heroClassType, Integer levelOfHero, Integer xpToNextLevel, Integer experience, Integer mana, Integer strength, Location currentLocation, Actor foundMonster, Player player, ArrayList inventory) {
        super(actorId, name, maxHitPoints, currentHitPoints, defense, attack, spellAttack, xpGained, gold, randomEvent, game);
        this.heroId = heroId;
        this.heroName = heroName;
        this.heroClassType = heroClassType;
        this.levelOfHero = levelOfHero;
        this.xpToNextLevel = xpToNextLevel;
        this.experience = experience;
        this.mana = mana;
        this.strength = strength;
        this.currentLocation = currentLocation;
        this.foundMonster = foundMonster;
        this.player = player;
        this.inventory = inventory;
    }


    @Id
    @Column(name = "HERO_ID")
    public Integer getHeroId() {
        return heroId;
    }
    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    @Column(name = "HERO_NAME")
    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Column(name = "HERO_TYPE")
    public String getHeroClassType() {
        return heroClassType;
    }
    public void setHeroClassType(String heroClassType) {
        this.heroClassType = heroClassType;
    }

    @Column(name = "HERO_LEVEL")
    public Integer getLevelOfHero() {
        return levelOfHero;
    }
    public void setLevelOfHero(Integer levelOfHero) {
        this.levelOfHero = levelOfHero;
    }

    @Column(name = "HERO_NEXT_LEVEL")
    public Integer getXpToNextLevel() {
        return xpToNextLevel;
    }
    public void setXpToNextLevel(Integer xpToNextLevel) {
        this.xpToNextLevel = xpToNextLevel;
    }

    @Column(name = "HERO_EXP")
    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Column(name = "HERO_MANA")
    public Integer getMana() {
        return mana;
    }
    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Column(name = "HERO_STR")
    public Integer getStrength() {
        return strength;
    }
    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    @Column(name = "HERO_CURR_LOCATION")
    public Location getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Actor getFoundMonster() {
        return foundMonster;
    }
    public void setFoundMonster(Actor foundMonster) {
        this.foundMonster = foundMonster;
    }

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList getInventory() {
        return inventory;
    }
    public void setInventory(ArrayList inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.heroClassType);
        hash = 29 * hash + this.levelOfHero;
        hash = 29 * hash + this.experience;
        hash = 29 * hash + this.mana;
        hash = 29 * hash + this.strength;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hero other = (Hero) obj;
        if (this.levelOfHero != other.levelOfHero) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        if (this.mana != other.mana) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (!Objects.equals(this.heroClassType, other.heroClassType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Here is your Hero:{" + "\n Hero Name = " + heroName + "\n Hero Class Type = " + heroClassType + "\n Level of Your Hero = " + levelOfHero + "\n Experience = " + experience + "\n Mana = " + mana + "\n Strength = " + strength + '}';
    }
    
    
    
}

