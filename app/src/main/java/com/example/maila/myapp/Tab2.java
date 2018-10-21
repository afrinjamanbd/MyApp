package com.example.maila.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Tab2 extends Fragment {

    private RecyclerView shoppingrecylerview;
    private List<Model_Class_Shoppinglist> firstshoppinglist;
    private Button adlist;
    View tab2view;

    public Tab2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     tab2view = inflater.inflate(R.layout.shoppinglist,container,false);
        shoppingrecylerview =(RecyclerView) tab2view.findViewById(R.id.shopping_recycleview);
        Recyclerviewadapter_Shoppinglist shoppingrecycleradapter = new Recyclerviewadapter_Shoppinglist(getContext(),firstshoppinglist);
        shoppingrecylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        shoppingrecylerview.setAdapter(shoppingrecycleradapter);

        adlist = (Button) tab2view.findViewById(R.id.addnewlist);
        adlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getActivity());
                View mView = getLayoutInflater().inflate(R.layout.dialog_addlist,null);
                final EditText listname = (EditText) mView.findViewById(R.id.listname);
                String newlistname = listname.getText().toString();
                Button proceed= (Button) mView.findViewById(R.id.dialogproceedaddlist);
                Button cancellist= (Button) mView.findViewById(R.id.dialogcanceladdlist);
                proceed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!listname.getText().toString().isEmpty()){
                            Intent addlistintent = new Intent(getActivity(),addlist.class);
                            startActivity(addlistintent);

                        }
                        else {
                            Toast.makeText(getActivity(),"List name is empty",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                cancellist.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                mBuilder.setView(mView);
                AlertDialog mdialog = mBuilder.create();
                mdialog.show();
            }
        });
     return tab2view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstshoppinglist = new ArrayList<>();
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","31"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Fish","32"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Meet","33"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Spices","34"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Grocery","35"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","36"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","37"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","38"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","39"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","40"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","41"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","42"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","43"));
        firstshoppinglist.add(new Model_Class_Shoppinglist("Vegetable","44"));
    }
}
