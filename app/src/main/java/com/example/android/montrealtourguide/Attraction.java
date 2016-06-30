package com.example.android.montrealtourguide;

public class Attraction {
    private String name;
    private String street;
    private String city; //Montreal has several small cities on its territory
    private String postalCode;
    private String dates;
    private int ImageResourceID;

    Attraction (String name, String street, String city, String postalCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    Attraction (String name, String street, String city, String postalCode, int ImageResourceID) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.ImageResourceID = ImageResourceID;
    }

    Attraction (String name, String dates) {
        this.name = name;
        this.dates = dates;
    }

    String getName(){
        return name;
    }

    String getStreet(){
        return street;
    }
    String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public String getDates() {
        return dates;
    }

    void setName(String name){
        this.name = name;
    }

    void setStreet(String street){
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", address='" + street + '\'' + city + '\'' + postalCode +
                '}';
    }
}
