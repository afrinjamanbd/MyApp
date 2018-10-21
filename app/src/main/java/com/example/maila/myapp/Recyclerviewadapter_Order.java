package com.example.maila.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Recyclerviewadapter_Order extends RecyclerView.Adapter<Recyclerviewadapter_Order.OrderViewHolder> {

    Context ordercontext;
    List<Model_Class_Order> orderdata;

    public Recyclerviewadapter_Order(Context ordercontext, List<Model_Class_Order> orderdata) {
        this.ordercontext = ordercontext;
        this.orderdata = orderdata;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View OrderView;
        OrderView = LayoutInflater.from(ordercontext).inflate(R.layout.order_design,parent,false);
        OrderViewHolder orderHolder = new OrderViewHolder(OrderView);
        return orderHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

        holder.ordername.setText(orderdata.get(position).getListname());
        holder.orderdistance.setText(orderdata.get(position).getDistance());
    }

    @Override
    public int getItemCount() {
        return orderdata.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder{
        private TextView ordername,orderdistance;
        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            orderdistance=(TextView) itemView.findViewById(R.id.orderdistanceid);
            ordername   =(TextView) itemView.findViewById(R.id.orderitemlistname);

        }
    }
}
