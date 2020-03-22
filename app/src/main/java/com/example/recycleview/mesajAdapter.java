package com.example.recycleview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mesajAdapter extends RecyclerView.Adapter<mesajAdapter.tanimla>  {
    List<mesajModel>list;
    Context context;

     public mesajAdapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        tanimla holder=new tanimla(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull tanimla holder, int position) {
        holder.kisi.setText(list.get(position).getIsim());
        holder.mesaj.setText(list.get(position).getMesaj());
        holder.img.setImageResource(list.get(position).getResimId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class tanimla extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        TextView mesaj;
        TextView kisi;

        public tanimla(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.resim);
            mesaj=itemView.findViewById(R.id.mesaj);
            kisi=itemView.findViewById(R.id.kisi);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
