package com.example.maila.myapp;

public class Model_Class_Shoppinglist {

    private String Itemlistname;
    private String Amount;

    public Model_Class_Shoppinglist() {
    }

    public Model_Class_Shoppinglist(String itemlistname, String amount) {
        Itemlistname = itemlistname;
        Amount = amount;
    }

    public String getItemlistname() {
        return Itemlistname;
    }

    public String getAmount() {
        return Amount;
    }

    public void setItemlistname(String itemlistname) {
        Itemlistname = itemlistname;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
