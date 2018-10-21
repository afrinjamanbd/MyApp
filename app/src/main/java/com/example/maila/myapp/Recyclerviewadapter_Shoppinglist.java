package com.example.maila.myapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Recyclerviewadapter_Shoppinglist extends RecyclerView.Adapter<Recyclerviewadapter_Shoppinglist.ShoppingViewHolder> {

    Context shopcontext;
    List<Model_Class_Shoppinglist> shopdata;
    Dialog listdialog;

    public Recyclerviewadapter_Shoppinglist(Context shopcontext, List<Model_Class_Shoppinglist> shopdata) {
        this.shopcontext = shopcontext;
        this.shopdata = shopdata;
    }

    @NonNull
    @Override
    public ShoppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View shopView;
        shopView = LayoutInflater.from(shopcontext).inflate(R.layout.shoppinglist_design,parent,false);
        ShoppingViewHolder shoppingHolder = new  ShoppingViewHolder(shopView);

        //Dialog for list item action
        listdialog = new Dialog(shopcontext);
        listdialog.setContentView(R.layout.dialog_shoppinglist);
        listdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        shoppingHolder.list_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button dialog_findshopper_btn = (Button) listdialog.findViewById(R.id.findshopper);
                Button dialog_edit_btn = (Button) listdialog.findViewById(R.id.editlist);
                Button dialog_delete_btn = (Button) listdialog.findViewById(R.id.dialogdeletelist);
                dialog_findshopper_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                dialog_edit_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                dialog_delete_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                listdialog.show();
            }
        });

        return shoppingHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingViewHolder holder, int position) {


        holder.list_name.setText(shopdata.get(position).getItemlistname());
        holder.price.setText(shopdata.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return shopdata.size();
    }

    public static class ShoppingViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout list_design;
        private TextView list_name;
        private  TextView price;

        public ShoppingViewHolder(@NonNull View itemView) {
            super(itemView);
            list_design= (LinearLayout) itemView.findViewById(R.id.shopping__design);
            list_name = (TextView) itemView.findViewById(R.id.itemlistname);
            price = (TextView) itemView.findViewById(R.id.amount);
        }
    }
}
