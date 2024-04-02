package com.example.tugas6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BarangAdapter barangadapter;
    private RecyclerView recyclerView;
    private ArrayList<BarangModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        barangadapter = new BarangAdapter(MainActivity.this, models);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(barangadapter);
    }
    private void getData() {

        models = new ArrayList<>();
        models.add(new BarangModel("Bola Golf Nike",R.drawable.bolagolf,"Harga: RP. 275.000", "Diameter: 5cm", "Warna: Putih"));
        models.add(new BarangModel("Bola Basket Spokey",R.drawable.bolabasket,"Harga: RP. 355.000", "Diameter: 20cm", "Warna: Merah Bata"));
        models.add(new BarangModel("Bola Kaki Adidas",R.drawable.bolakaki,"Harga: RP. 325.000", "Diameter: 26cm", "Warna: Putih Hitam"));
        models.add(new BarangModel("Bola Tennis Wilson", R.drawable.bolatenis,"Harga: RP. 160.000", "Diameter: 7cm", "Warna: Hijau"));
        models.add(new BarangModel("Bola Voli Mikasa",R.drawable.bolavoli,"Harga: RP. 195.000", "Diameter: 14cm", "Warna: Kuning Biru"));

        models.add(new BarangModel("Sepatu Bola Nike",R.drawable.sepatubola,"Harga: RP. 499.000", "Size: 43", "Warna: Oren Hitam"));
        models.add(new BarangModel("Sepatu Converse",R.drawable.sepatuconverse,"Harga: RP. 320.000", "Size: 41", "Warna: Kuning"));
        models.add(new BarangModel("Sepatu Jordan",R.drawable.sepatujordan,"Harga: RP. 699.000", "Size: 43", "Warna: Kuning Hitam"));
        models.add(new BarangModel("Sepatu Running",R.drawable.sepaturunning ,"Harga: RP. 438.000", "Size: 40", "Warna: Hijau Biru"));
        models.add(new BarangModel("Sepatu Vans",R.drawable.sepatuvans,"Harga: RP. 265.000", "Size: 42", "Warna: Hitam"));

        models.add(new BarangModel("Baju Basket",R.drawable.bajubasket,"Harga: RP. 155.000", "Size: M", "Warna: Merah"));
        models.add(new BarangModel("Baju Bola",R.drawable.bajubola,"Harga: 195.000", "Size: L", "Warna: Merah"));
        models.add(new BarangModel("Baju Tennis",R.drawable.bajutenis,"Harga: RP. 240.000", "Size: XL", "Warna: Biru"));
        models.add(new BarangModel("Baju Voli",R.drawable.bajuvoli,"Harga: RP. 147.000", "Size: S", "Warna: Biru Dongker"));
        models.add(new BarangModel("Baju Bersepeda", R.drawable.bajusepeda,"Harga: RP. 215.000", "Size: L", "Warna: Abu-Abu Merah"));
    }
}
