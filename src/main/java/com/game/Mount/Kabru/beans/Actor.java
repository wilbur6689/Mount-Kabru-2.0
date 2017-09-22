package com.game.Mount.Kabru.beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="ACTOR")
public class Actor {

    //class instance variables
    private Integer actorId;
    private String name;
    private Integer maxHitPoints;
    private Integer currentHitPoints;
    private Integer defense;
    private Integer attack;
    private Integer spellAttack;
    private Integer xpGained;
    private Integer gold;
    
    private Event[] randomEvent;
    private Game game;

    public Actor() {
        
    }

    public Actor(Integer actorId, String name, Integer maxHitPoints, Integer currentHitPoints, Integer defense, Integer attack, Integer spellAttack, Integer xpGained, Integer gold, Event[] randomEvent, Game game) {
        this.actorId = actorId;
        this.name = name;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.defense = defense;
        this.attack = attack;
        this.spellAttack = spellAttack;
        this.xpGained = xpGained;
        this.gold = gold;
        this.randomEvent = randomEvent;
        this.game = game;
    }

    @Id
    @Column(name = "ACTOR_ID")
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
    @Column(name = "ACTOR_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "ACTOR_MAX_HP")
    public Integer getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(Integer maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }
    @Column(name = "ACTOR_CURR_HP")
    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }
    @Column(name = "ACTOR_DEFENSE")
    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }
    @Column(name = "ACTOR_ATTACK")
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }
    @Column(name = "ACTOR_SPELL_ATTACK")
    public Integer getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(Integer spellAttack) {
        this.spellAttack = spellAttack;
    }
    @Column(name = "ACTOR_XP_GAINED")
    public Integer getXpGained() {
        return xpGained;
    }

    public void setXpGained(Integer xpGained) {
        this.xpGained = xpGained;
    }
    @Column(name = "ACTOR_GOLD")
    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }
    @Column(name = "ACTOR_RND_EVENT")
    public Event[] getRandomEvent() {
        return randomEvent;
    }

    public void setRandomEvent(Event[] randomEvent) {
        this.randomEvent = randomEvent;
    }
    @Column(name = "ACTOR_GAME")
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.maxHitPoints;
        hash = 37 * hash + this.defense;
        hash = 37 * hash + this.attack;
        hash = 37 * hash + this.xpGained;
        hash = 37 * hash + this.gold;
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
        final Actor other = (Actor) obj;
        if (this.maxHitPoints != other.maxHitPoints) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.xpGained != other.xpGained) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", maxHitPoints=" + maxHitPoints + ", currentHitPoints=" + currentHitPoints + ", defense=" + defense + ", attack=" + attack + ", spellAttack=" + spellAttack + ", xpGained=" + xpGained + ", gold=" + gold + '}';
    }

    
    
    
    
    
}
