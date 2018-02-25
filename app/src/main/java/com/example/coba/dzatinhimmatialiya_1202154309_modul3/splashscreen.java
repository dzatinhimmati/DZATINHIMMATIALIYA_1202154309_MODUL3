package com.example.coba.dzatinhimmatialiya_1202154309_modul3;

/**
 * Created by THOSIBA on 24-Feb-18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by THOSIBA on 18-Feb-18.
 */

public class splashscreen extends AppCompatActivity {

    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_activity);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(splashscreen.this, MainActivity.class);
                startActivity(i); // MENGHUBUNGKAN SPALSH SCREEN DENGAN MAIN ACTIVITY

                Toast.makeText(splashscreen.this,"Berhasil Masuk",Toast.LENGTH_LONG).show();

                //TAMPILAN TOAST PADA APLIKASI
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };
}
