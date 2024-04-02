package com.example.tugas6;

public class BarangModel {
    private String nama;
    private int gambar;
    private String deskripsi1;
    private String deskripsi2;
    private String deskripsi3;

    public BarangModel(String nama, int gambar, String deskripsi1, String deskripsi2, String deskripsi3) {
        this.nama = nama;
        this.gambar = gambar;
        this.deskripsi1 = deskripsi1;
        this.deskripsi2 = deskripsi2;
        this.deskripsi3 = deskripsi3;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }


    public String getDeskripsi1() {
        return deskripsi1;
    }

    public void setDeskripsi1(String deskripsi1) {
        this.deskripsi1 = deskripsi1;
    }


    public String getDeskripsi2() {return deskripsi2;
    }

    public void setDeskripsi2(String deskripsi2) {
        this.deskripsi2 = deskripsi2;
    }

    public String getDeskripsi3() {return deskripsi3;
    }
    public void setDeskripsi3(String deskripsi3) {
        this.deskripsi3 = deskripsi3;
    }
}
