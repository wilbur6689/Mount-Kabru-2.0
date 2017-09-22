package com.game.Mount.Kabru.beans;

import com.game.Mount.Kabru.beans.enums.Items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

import java.io.Serializable;

@Entity
@Table(name="ACTOR")
public class Game implements Serializable{

    private Integer gameId;
    private String main;
    private Player player;
    private World world;
    private boolean endOfGame = false;
    
    private Items[] items;
    private Actor[][] actors;
    private Hero hero;
  
    

    public Game() {
    }

    public Game(Integer gameId, String main, Player player, World world, boolean endOfGame, Items[] items, Actor[][] actors, Hero hero) {
        this.gameId = gameId;
        this.main = main;
        this.player = player;
        this.world = world;
        this.endOfGame = endOfGame;
        this.items = items;
        this.actors = actors;
        this.hero = hero;
    }


    @Id
    @Column(name = "GAME_ID")
    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public boolean isEndOfGame() {
        return endOfGame;
    }

    public void setEndOfGame(boolean endOfGame) {
        this.endOfGame = endOfGame;
    }
    
        
    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    
    public Actor[][] getActors() {
        return actors;
    }

    public void setActors(Actor[][] actors) {
        this.actors = actors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.main);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.main, other.main)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "main=" + main + '}';
    }
    
    
   
}
