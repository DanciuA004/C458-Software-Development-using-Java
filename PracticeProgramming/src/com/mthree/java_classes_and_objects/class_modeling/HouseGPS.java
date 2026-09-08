package com.mthree.java_classes_and_objects.class_modeling;

public abstract class HouseGPS {
    private int houseNumber;
    private String streetName;
    private String city;
    private String postcode;
    private String country;
    private double latitude;
    private double longitude;

    public HouseGPS(int houseNumber, String streetName,
                    String city, String postcode, String country,
                    double latitude, double longitude) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
