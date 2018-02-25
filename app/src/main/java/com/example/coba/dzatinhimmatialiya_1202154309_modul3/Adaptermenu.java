package com.example.coba.dzatinhimmatialiya_1202154309_modul3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by THOSIBA on 25-Feb-18.
 */

public class Adaptermenu extends RecyclerView.Adapter<Adaptermenu.ViewHolder>{
    private Context context;
    private List<menulist> listair_activity;


    public Adaptermenu(listair listair, List<menulist> listair_activity) {
        this.context = context;
        this.listair_activity = listair_activity;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vw = LayoutInflater.from(context).inflate(R.layout.cardview_activity, parent, false);
        ViewHolder hldr = new ViewHolder(vw) {
            @Override
            public String toString() {
                return super.toString ();
            }
        };
        return hldr;

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //mengambil elemen dari array pada posisi tertentu
        menulist dt = listair_activity.get(position);
        //mengeset isi view dengan elemen dari data
        holder.nama.setText(dt.getNama());
        holder.detail.setText(dt.getDesc());
        //kondisi gambar dari drawable dijadikan sebagai background dari cardview
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rl.setBackground(holder.rl.getResources().getDrawable(dt.getGambar()));
        }
        holder.rl.setTag(dt.getGambar());
    }

    @Override
    public int getItemCount() {
        return listair_activity.size();
    }
        class ViewHolder extends RecyclerView.ViewHolder{
            //deklarasi variable
            TextView nama, detail ;
            RelativeLayout rl;
            public ViewHolder(View itemView) {
                super(itemView);
                //mengakses nama, detail, dan rl yang ada pada layout
                nama = itemView.findViewById(R.id.namaair);
                detail = itemView.findViewById(R.id.deskripsi);
                rl = itemView.findViewById(R.id.rv);
                //implementasi onclicklistener
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    //ketika cardview di klik
                    public void onClick(View view) {
                        //bmembuat intent bernama move
                        Intent move = new Intent(context,detailactivity.class);
                        //mengirimkan data data yang diambil ke detail air untuk di tampilkan
                        move.putExtra("nama", nama.getText());
                        move.putExtra("detail", detail.getText());
                        move.putExtra("gambar",rl.getTag().toString());
                        //mengeksekusi intent
                        context.startActivity(move);
                    }
                });
            }
        }

    }

