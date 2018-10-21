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

public class order extends Fragment {

    View orderview;
    private RecyclerView orderrecylerview;
    private List<Model_Class_Order> firstorder;

    public order() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    orderview = inflater.inflate(R.layout.order,container,false);
        orderrecylerview=(RecyclerView) orderview.findViewById(R.id.order_recycleview);
        Recyclerviewadapter_Order orderrecycleradapter = new Recyclerviewadapter_Order(getContext(),firstorder);
        orderrecylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        orderrecylerview.setAdapter(orderrecycleradapter);
    return orderview;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstorder = new ArrayList<>();
        firstorder.add(new Model_Class_Order("My list","40"));
        firstorder.add(new Model_Class_Order("Mdsadsa","54"));
        firstorder.add(new Model_Class_Order("Myasfsfgsgst","4440"));
        firstorder.add(new Model_Class_Order("Mysdsafdct","88"));
        firstorder.add(new Model_Class_Order("dadst","404"));
        firstorder.add(new Model_Class_Order("fczdczdt","44450"));
        firstorder.add(new Model_Class_Order("MczdczCt","404"));
        firstorder.add(new Model_Class_Order("Masassst","4045"));
        firstorder.add(new Model_Class_Order("Mdsdscsf  t","450"));
    }
}
