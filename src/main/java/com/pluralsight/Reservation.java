package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public String setRoomType(String roomType) {
        return this.roomType;
    }

    public double getPrice() {
        //If the room type is "king" the price per night is $139.00
        //if the room type is "double" the price per night is $124.00
        if (!isWeekend) {
            if (this.roomType.equals("king")) {
                return 139.0;
            } else if (this.roomType.equals("queen")) {
                return 124.0;
            }
        }
        //If the stay is over a weekend, the price per night should increase by 10%
         if (isWeekend) {
             if (this.roomType.equals("king")) {
                 return 139.0 + 139.0 * 0.1;
             } else if (this.roomType.equals("queen")) {
                 return 124.0 + 124.0 * 0.1;
             }
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
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return this.numberOfNights * getPrice();
    }
}
