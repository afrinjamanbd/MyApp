package com.example.maila.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Recyclerviewadapter_Addlist extends RecyclerView.Adapter<Recyclerviewadapter_Addlist.AddlistViewHolder> {

    Context addlistcontext;
    List<Model_Class_Addlist> addlistdata;

    public Recyclerviewadapter_Addlist(Context addlistcontext, List<Model_Class_Addlist> addlistdata) {
        this.addlistcontext = addlistcontext;
        this.addlistdata = addlistdata;
    }

    @NonNull
    @Override
    public AddlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View addlistview;
        addlistview= LayoutInflater.from(addlistcontext).inflate(R.layout.addlist_design,parent,false);
        AddlistViewHolder addlistHolder = new AddlistViewHolder(addlistview);
        return addlistHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AddlistViewHolder holder, int position) {

        holder.tv_additemname.setText(addlistdata.get(position).getItemname());
        holder.tv_maxprice.setText(addlistdata.get(position).getMaxprice());
    }

    @Override
    public int getItemCount() {
        return addlistdata.size();
    }

    public  static class AddlistViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_additemname,tv_maxprice;
        public AddlistViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_additemname =(TextView) itemView.findViewById(R.id.itemname);
            tv_maxprice= (TextView) itemView.findViewById(R.id.max);
        }
    }
}
