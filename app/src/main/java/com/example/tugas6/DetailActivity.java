package com.example.tugas6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class DetailActivity extends AppCompatActivity {

    private String nama;
    private int gambar;
    private String deskripsi1;
    private String deskripsi2;
    private String deskripsi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EdgeToEdge.enable(this);

        nama = getIntent().getStringExtra("nama");
        gambar = getIntent().getIntExtra("gambar", 0);

        deskripsi1 = getIntent().getStringExtra("deskripsi_1");
        deskripsi2 = getIntent().getStringExtra("deskripsi_2");
        deskripsi3 = getIntent().getStringExtra("deskripsi_3");


        TextView namaDetail = findViewById(R.id.nama_barang);
        ImageView gambarDetail = findViewById(R.id.gambar_detail);
        TextView deskripsi1TextView = findViewById(R.id.hargabarang);
        TextView deskripsi2TextView = findViewById(R.id.ket);
        TextView deskripsi3TextView = findViewById(R.id.warna);

        namaDetail.setText(nama);
        gambarDetail.setImageResource(gambar);
        deskripsi1TextView.setText(deskripsi1);
        deskripsi2TextView.setText(deskripsi2);
        deskripsi3TextView.setText(deskripsi3);
    }


    public void shareItem(View view) {

        String textToShare = "Nama: " + nama + "\n" + deskripsi1 + "\n" +  deskripsi2 + "\n" + deskripsi3;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);

        startActivity(Intent.createChooser(shareIntent, "Share"));
    }
}