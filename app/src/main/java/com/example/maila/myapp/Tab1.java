package com.example.maila.myapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Tab1 extends Fragment{

    View tab1view;
    private RecyclerView reqrecycleview;
    private List<Model_Class_Request> firstrequest;

    public Tab1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tab1view = inflater.inflate(R.layout.request,container,false);
        reqrecycleview =(RecyclerView) tab1view.findViewById(R.id.request_recycleview);
        Recyclerviewadapter_Request requestrecycleradapter = new Recyclerviewadapter_Request(getContext(),firstrequest);
        reqrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        reqrecycleview.setAdapter(requestrecycleradapter);
        return tab1view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstrequest= new ArrayList<>();
        firstrequest.add(new Model_Class_Request("Admin","37km",R.drawable.profileicon));
        firstrequest.add(new Model_Class_Request("Alex","38km",R.drawable.profileicon));
        firstrequest.add(new Model_Class_Request("Max","39km",R.drawable.profileicon));
        firstrequest.add(new Model_Class_Request("Marry","340km",R.drawable.profileicon));
        firstrequest.add(new Model_Class_Request("John","343km",R.drawable.profileicon));
        firstrequest.add(new Model_Class_Request("Sam","332km",R.drawable.profileicon));
    }
}
