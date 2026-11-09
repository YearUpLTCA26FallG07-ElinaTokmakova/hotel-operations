package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Reservation { // responsible for storing info related to a guest stay
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public String setRoomType(String roomType) {
        return this.roomType;
    }

    public double getPrice() {
        //If the room type is "king" the price per night is $139.00
        //if the room type is "double" the price per night is $124.00
        double baseprice = 0;
        if (!weekend) {
            if (this.roomType.equals("king")) {
                baseprice = 139;
            } else if (this.roomType.equals("double")) {
                baseprice = 124;
            } else {
                baseprice = 0;
            }
        }
        //If the stay is over a weekend, the price per night should increase by 10%
        if (weekend) {
            return baseprice *= 1.1;
        }
        return 0;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return this.numberOfNights * getPrice();
    }

    @Override
    public String toString() {
        return getRoomType() + getNumberOfNights() + isWeekend();
    }
}
