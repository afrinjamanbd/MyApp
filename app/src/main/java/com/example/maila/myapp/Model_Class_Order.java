package com.example.maila.myapp;

public class Model_Class_Order {

    private String Listname;
    private String Distance;

    public Model_Class_Order() {
    }

    public Model_Class_Order(String listname, String distance) {
        Listname = listname;
        Distance = distance;
    }

    public void setListname(String listname) {
        Listname = listname;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public String getListname() {

        return Listname;
    }

    public String getDistance() {
        return Distance;
    }
}
