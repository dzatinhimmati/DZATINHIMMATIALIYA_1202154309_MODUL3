package com.example.coba.dzatinhimmatialiya_1202154309_modul3;

/**
 * Created by THOSIBA on 25-Feb-18.
 */

public class menulist {
    //deklarasi variable yang akan digunakan
    int gambar;
    String nama;
    String desc;

    public menulist(int gambar, String nama, String desc) {
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }

    //method getter untuk get gambar
    public int getGambar() {
        return gambar;
    }

    //method getter untuk get nama
    public String getNama() {
        return nama;
    }

    //method getter untuk get detail
    public String getDesc() {
        return desc;

    }
}
