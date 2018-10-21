package com.example.maila.myapp;

public class Model_Class_Request {

    private String Shoppername;
    private String Shopperdistance;
    private int Shopperimage;

    public Model_Class_Request() {
    }

    public Model_Class_Request(String shoppername, String shopperdistance, int shopperimage) {
        Shoppername = shoppername;
        Shopperdistance = shopperdistance;
        Shopperimage = shopperimage;
    }

    public String getShoppername() {
        return Shoppername;
    }

    public String getShopperdistance() {
        return Shopperdistance;
    }

    public int getShopperimage() {
        return Shopperimage;
    }

    public void setShoppername(String shoppername) {
        Shoppername = shoppername;
    }

    public void setShopperdistance(String shopperdistance) {
        Shopperdistance = shopperdistance;
    }

    public void setShopperimage(int shopperimage) {
        Shopperimage = shopperimage;
    }
}
