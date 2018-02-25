package com.example.coba.dzatinhimmatialiya_1202154309_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class listair extends AppCompatActivity {
    RecyclerView rv;
    Adaptermenu amenu;
    List<menulist> listair_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listair_activity);
        //set title bar menjadi Dafter Air Mineral
        setTitle("Daftar Air Mineral");

        //membuat array list baru dengan nama listair_activity
        listair_activity = new ArrayList<>();
        //mendapat penanganan recycler view
        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid
            rv.setLayoutManager(new GridLayoutManager(listair.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid saja
            rv.setLayoutManager(new GridLayoutManager(listair.this, 1));
        }
        //menjalankan fungsi input data
        inputdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(listair.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(listair.this, 1));
        }
    }

    public void inputdata(){


                //memasukkan data ke dalam array
        listair_activity.add (new menulist (R.drawable.ades, "Ades", "AAAAAAAAAAAAAAAAAAA"));
        listair_activity.add(new menulist(R.drawable.amidis,"Amidis", "Ini adalah air mineral merk Amidis. \nAMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida."));
        listair_activity.add(new menulist(R.drawable.aqua, "Aqua", "Ini adalah air mineral merk Aqua. \nAqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei."));
        listair_activity.add(new menulist(R.drawable.cleo, "Cleo", "Ini adalah air mineral merk Cleo. \nAir Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride."));
        listair_activity.add(new menulist(R.drawable.club, "Club", "Ini adalah air mineral merk Club. \nClub adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk."));
        listair_activity.add(new menulist(R.drawable.equil, "Equil", "Ini adalah air mineral merk Equil. \nEquil adalah air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat."));
        listair_activity.add(new menulist(R.drawable.evian, "Evian", "Ini adalah air mineral merk Evian. \nEvian adalah air mineral alami berasal dari satu sumber di puncak pegunungan Alpen, Perancis. Setiap tetesnya melewati perjalanan dan proses alam selama 15 tahun sebelum muncul di mata air. Pembentukan mineral terjadi selama proses alami tersebut, melewati lapisan es dan bebatuan, dalam komposisi yang unik. "));
        listair_activity.add(new menulist(R.drawable.leminerale, "leMinerale", "Ini adalah air mineral merk leMinerale. \nLe Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis."));
        listair_activity.add(new menulist(R.drawable.nestle, "Nestle", "Ini adalah air mineral merk Nestle. \nKesegaran tak tergantikan dari Nestlé Pure Life Mineral Water yang berasal dari segala kemurnian mata air pilihan dan diproses secara higienis. Spesifikasi Produk. Jenis Produk: Air Mineral. Isi: 1500ml."));
        listair_activity.add(new menulist(R.drawable.pristine, "Pristine", "Ini adalah air mineral merk Pristine. \nAir minum yang bersih adalah air minum beralkali yang di proses ionisasi, air minum pristine adalah air alkali dengan ph 8 yang bermanfaat untuk kesehatan, air minum kemasan praktis dan ekonomis."));
        listair_activity.add(new menulist(R.drawable.vit, "Vit", "Ini adalah air mineral merk Vit. \nVIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        amenu = new Adaptermenu(this,listair_activity);
        //menguhubungkan recycler view dengan adapter
        rv.setAdapter(amenu);
    }
}