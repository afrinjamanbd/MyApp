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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Recyclerviewadapter_Request extends RecyclerView.Adapter<Recyclerviewadapter_Request.RequestVIewHolder>{

    Context reqcontext;
    List<Model_Class_Request> reqdata;
    Dialog reqdialog;

    public Recyclerviewadapter_Request(Context reqcontext, List<Model_Class_Request> reqdata) {
        this.reqcontext = reqcontext;
        this.reqdata = reqdata;
    }

    @NonNull
    @Override
    public RequestVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View reqView;
        reqView = LayoutInflater.from(reqcontext).inflate(R.layout.request_design,parent,false);
        final RequestVIewHolder requestHolder = new RequestVIewHolder(reqView);

        //Dialog for new list
        reqdialog = new Dialog(reqcontext);
        reqdialog.setContentView(R.layout.dialog_request);
        reqdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        requestHolder.req_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView dialog_req_name_tv= (TextView) reqdialog.findViewById(R.id.dialognamereq);
                TextView dialog_req_distance_tv = (TextView) reqdialog.findViewById(R.id.dialogdistancereq);
                ImageView dialog_req_image_img = (ImageView) reqdialog.findViewById(R.id.dialogreqimage);
                Button dialog_req_no_btn = (Button) reqdialog.findViewById(R.id.dialognoreq);
                Button dialog_req_yes_btn = (Button) reqdialog.findViewById(R.id.dialogyesreq);
                dialog_req_name_tv.setText(reqdata.get(requestHolder.getAdapterPosition()).getShoppername());
                dialog_req_distance_tv.setText(reqdata.get(requestHolder.getAdapterPosition()).getShopperdistance());
                dialog_req_image_img.setImageResource(reqdata.get(requestHolder.getAdapterPosition()).getShopperimage());
                reqdialog.show();

                dialog_req_yes_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });

                dialog_req_no_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });

        return requestHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RequestVIewHolder holder, int position) {

        holder.tv_shoppername.setText(reqdata.get(position).getShoppername());
        holder.tv_distance.setText(reqdata.get(position).getShopperdistance());
        holder.img.setImageResource(reqdata.get(position).getShopperimage());
    }

    @Override
    public int getItemCount() {
        return reqdata.size();
    }

    public static class RequestVIewHolder extends RecyclerView.ViewHolder{
        private LinearLayout req_design;
        private TextView tv_shoppername,tv_distance;
        private ImageView img;

        public RequestVIewHolder(@NonNull View itemView) {
            super(itemView);
            req_design= (LinearLayout) itemView.findViewById(R.id.design_req);
            tv_shoppername= (TextView) itemView.findViewById(R.id.shoppernameid);
            tv_distance  = (TextView) itemView.findViewById(R.id.distanceid);
            img=(ImageView) itemView.findViewById(R.id.shopperimage);
        }
    }
}
