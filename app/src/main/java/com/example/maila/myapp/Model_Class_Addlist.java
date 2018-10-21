package com.example.maila.myapp;

public class Model_Class_Addlist {

    private String Itemname;
    private String Maxprice;

    public Model_Class_Addlist() {
    }

    public Model_Class_Addlist(String itemname, String maxprice) {
        Itemname = itemname;
        Maxprice = maxprice;
    }

    public String getItemname() {
        return Itemname;
    }

    public String getMaxprice() {
        return Maxprice;
    }

    public void setItemname(String itemname) {
        Itemname = itemname;
    }

    public void setMaxprice(String maxprice) {
        Maxprice = maxprice;
    }
}
