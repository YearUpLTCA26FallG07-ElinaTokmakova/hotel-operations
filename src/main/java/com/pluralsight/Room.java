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
        if (!dirty && !occupied) {
            return true;
        }
        return false;
    }

    public void checkIn() {
        if (occupied) {
            System.out.println("△ Cannot check in. This room is already occupied.");
        } else if (dirty) {
            System.out.println("△ Cannot check in. This room hasn't been cleaned yet.");
        } else {
            occupied = true;
            dirty = true;
            System.out.println("✓ Successfully checked in.");
        }
    }

    public void checkOut() {
        if(occupied) {
            occupied = false;
            dirty = true;
            System.out.println("✓ Successfully checked out.");
        } else {
            System.out.println("△ Nothing to check out. Room is not occupied.");
        }
    }

    public void cleanRoom() {
        if(!occupied && dirty) {
            dirty = false;
            System.out.println("✓ Room is clean and marked available.");
        } else if (occupied) {
            System.out.println("△ Cannot clean. Room is currently occupied.");
        } else {
            System.out.println("△ Room is already clean.");
        }
    }

    public String toString() {
        return String.format("Beds: %d, Price: %.2f, Occupied: %b, Dirty: %b, Available: %b",
                getNumberOfBeds(), getPrice(), isOccupied(), isDirty(), isAvailable());
    }
}
