package com.game.Mount.Kabru.beans;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="ACTOR")
public class Event implements Serializable{
    
    String eventType;
    String locationType;
    String eventName;
    String eventDescription;
    Actor[] actors;
    int[] goldEvent;

    public Event(String eventType, String locationType, String eventName, String eventDescription, Actor[] actors, int[] goldEvent) {
        this.eventType = eventType;
        this.locationType = locationType;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.actors = actors;
        this.goldEvent = goldEvent;
    }

    


    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
    
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Actor[] getActors() {
        return actors;
    }

    public int[] getGoldEvent() {
        return goldEvent;
    }

    public void setGoldEvent(int[] goldEvent) {
        this.goldEvent = goldEvent;
    }

    
    }
