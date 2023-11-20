package com.example.uts_semester5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdatJawaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_jawa);
    }

    public void hal_katalog(View view) {
        Intent intent =new Intent(AdatJawaActivity.this, KatalogBajuActivity.class);
        startActivity(intent);
    }

    public void hal_sewa(View view) {
        Intent intent =new Intent(AdatJawaActivity.this, SewaBajuActivity.class);
        startActivity(intent);
    }
}