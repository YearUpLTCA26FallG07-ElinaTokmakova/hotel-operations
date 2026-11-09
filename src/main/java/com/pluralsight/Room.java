package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
