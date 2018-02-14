package com.example.android.dormee;

public class Apartment {
    int ID;
    String name;
    int price;
    int noOfRooms;
    int area;
    String location;
    // Image, description, FLat type, and possibly other data to be added
    static int refID = 1100;

    public Apartment(String name, int price, int noOfRooms, int area, String location) {
        this.name = name;
        this.price = price;
        this.noOfRooms = noOfRooms;
        this.area = area;
        this.location = location;
        this.assignID();
    }

    // Manual ID constructor
    public Apartment(int ID, String name, int price, int noOfRooms, int area, String location) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.noOfRooms = noOfRooms;
        this.area = area;
        this.location = location;
    }

    private void assignID() {
        this.ID = refID;
        refID++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public int getArea() {
        return area;
    }

    public String getLocation() {
        return location;
    }

    public static int getRefID() {
        return refID;
    }

    @Override
    public String toString() {
        return name;
    }
}
