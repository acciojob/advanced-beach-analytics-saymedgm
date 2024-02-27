package com.driver;

public class Beach {
    private String name;
    private String location;
    private int yearlyVisitors;
    private double rating;

    public Beach(String name, String location, int yearlyVisitors, double rating) {
        this.name = name;
        this.location = location;
        this.yearlyVisitors = yearlyVisitors;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getYearlyVisitors() {
        return yearlyVisitors;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Beach{name='" + name + "', location='" + location + "', yearlyVisitors=" + yearlyVisitors + ", rating=" + rating + '}';
    }
}