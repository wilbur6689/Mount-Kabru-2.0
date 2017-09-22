package com.game.Mount.Kabru.beans;

import byui.cit260.mountKabru.control.WorldControl;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="ACTOR")
public class Location implements Serializable {

    private String locationName;
    private Event event;
    private boolean discovered;
    private int row;
    private int column;

    public Location() {

    }

    public Location(String locationName, boolean discovered, int row, int column) {
        this.locationName = locationName;
        this.discovered = discovered;
        this.row = row;
        this.column = column;
    }


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public boolean isDiscovered() {
        return discovered;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    
}
