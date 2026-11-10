package com.pluralsight;

public class Hotel {
    private String name = "Hilton";
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (!suite && roomCount <= getAvailableRooms()) {
            bookedBasicRooms += roomCount;
            return true;
        } else if (suite && roomCount <= getAvailableSuites()) {
            bookedSuites += roomCount;
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public String toString() {
        return String.format("%s: " +
                        "Booked suites: %d, Booked basic rooms: %d, " +
                        "Available suites: %d, Available basic rooms: %d",
                getName(), getBookedSuites(), getBookedBasicRooms(), getAvailableSuites(), getAvailableRooms());
    }
;}
