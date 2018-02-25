package com.example.coba.dzatinhimmatialiya_1202154309_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editTextusername);
        password = (EditText) findViewById(R.id.editTextpassword);
        btlogin = (Button) findViewById(R.id.buttonlogin);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")
                        ||usernameKey.equals("1202154309") && passwordKey.equals("46")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, listair.class);
                    String user2 = username.getText().toString();
                    intent.putExtra("username", user2);
                    startActivity(intent);
                    MainActivity.this.startActivity(intent);


                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Salah")
                            .setNegativeButton("Retry", null).create().show();

                }

            }
        });

    }
}
