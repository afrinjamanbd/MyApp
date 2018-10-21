package com.example.maila.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class addlist extends AppCompatActivity {


    private RecyclerView addlistrecycleview;
    private List<Model_Class_Addlist> firstaddlist;
    private RecyclerView.Adapter adapteraddlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlist);

       // addlistrecycleview =(RecyclerView) findViewById(R.id.additemlist_recycler);
       // Recyclerviewadapter_Addlist addlistrecycleradapter = new Recyclerviewadapter_Addlist(this,firstaddlist);
       // addlistrecycleview.setLayoutManager(new LinearLayoutManager(this));
       // addlistrecycleview.setAdapter(addlistrecycleradapter);

       // firstaddlist = new ArrayList<>();

       // firstaddlist.add(new Model_Class_Addlist("potato","60"));
       // firstaddlist.add(new Model_Class_Addlist("potato","60"));
       // firstaddlist.add(new Model_Class_Addlist("potato","60"));
       // firstaddlist.add(new Model_Class_Addlist("potato","60"));
        addlistrecycleview =(RecyclerView) findViewById(R.id.additemlist_recycler);
        addlistrecycleview.setLayoutManager(new LinearLayoutManager(this));
        firstaddlist = new ArrayList<>();
        Model_Class_Addlist model_class_addlist = new Model_Class_Addlist("m","0");
        firstaddlist.add(new Model_Class_Addlist("potato","60"));
        firstaddlist.add(new Model_Class_Addlist("potato","60"));
        firstaddlist.add(new Model_Class_Addlist("potato","60"));
        firstaddlist.add(new Model_Class_Addlist("potato","60"));

        adapteraddlist = new Recyclerviewadapter_Addlist(this,firstaddlist);
        addlistrecycleview.setAdapter(adapteraddlist);

    }
}
