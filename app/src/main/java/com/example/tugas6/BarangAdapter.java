package com.example.tugas6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder> {

    private ArrayList<BarangModel> models;
    private Context context;

    public BarangAdapter(Context context, ArrayList<BarangModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public BarangAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BarangAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        BarangModel currentModel = models.get(position);

        holder.namaBarang.setText(currentModel.getNama());
        holder.gambar.setImageResource(currentModel.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", currentModel.getNama());
                intent.putExtra("gambar", currentModel.getGambar());
                intent.putExtra("deskripsi_1", currentModel.getDeskripsi1());
                intent.putExtra("deskripsi_2", currentModel.getDeskripsi2());
                intent.putExtra("deskripsi_3", currentModel.getDeskripsi3());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaBarang;
        ImageView gambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaBarang = itemView.findViewById(R.id.nama_barang);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}

