package com.example.uts_semester5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Tombol_info(View view) {
        Intent intent =new Intent(MainActivity.this, KatalogBajuActivity.class);
        startActivity(intent);
    }

    public void tombol_sewa(View view) {
        Intent intent =new Intent(MainActivity.this, SewaBajuActivity.class);
        startActivity(intent);
    }

    public void tombol_contact(View view) {
        Intent intent =new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent);
    }

    public void tombol_tentang(View view) {
        Intent intent =new Intent(MainActivity.this, TentangActivity.class);
        startActivity(intent);
    }
}