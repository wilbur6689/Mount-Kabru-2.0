package com.game.Mount.Kabru.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="ACTOR")
public class Event implements Serializable{

    private Integer eventId;
    private String eventType;
    private String locationType;
    private String eventName;
    private String eventDescription;
    private Actor[] actors;
    private Integer[] goldEvent;

    public Event() {
    }

    public Event(Integer eventId, String eventType, String locationType, String eventName, String eventDescription, Actor[] actors, Integer[] goldEvent) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.locationType = locationType;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.actors = actors;
        this.goldEvent = goldEvent;
    }

    @Id
    @Column(name = "EVENT_ID")
    public Integer getEventId() {
        return eventId;
    }
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Column(name = "EVENT_TYPE")
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Column(name = "EVENT_NAME")
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "EVENT_LOCATION_TYPE")
    public String getLocationType() {
        return locationType;
    }
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Column(name = "EVENT_DESC")
    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Actor[] getActors() {
        return actors;
    }
    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Integer[] getGoldEvent() {
        return goldEvent;
    }
    public void setGoldEvent(Integer[] goldEvent) {
        this.goldEvent = goldEvent;
    }


}
