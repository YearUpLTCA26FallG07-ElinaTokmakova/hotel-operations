package com.pluralsight;

public class Room { // responsible for knowing everything related to a hotel room
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public Room() {
        this.numberOfBeds = 2;
        this.price = 300;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() { // if it is clean and not currently occupied
        return !dirty && !occupied;
    }

    public void checkIn() {
        occupied = true;
        dirty = true;
    }

    public void checkOut() {
        occupied = false;
    }

    public void cleanRoom() {
        dirty = false;
    }

    public String toString() {
        return String.format("Beds: %d, Price: %.2f, Occupied: %b, Dirty: %b, Available: %b",
                getNumberOfBeds(), getPrice(), isOccupied(), isDirty(), isAvailable());
    }
}
