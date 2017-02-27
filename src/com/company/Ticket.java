package com.company;

/**
 * Created by df377 on 2/27/17.
 */
public abstract class Ticket {

    private int serialNumber;

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber() {
        //returns new unique serial number
    }
}
