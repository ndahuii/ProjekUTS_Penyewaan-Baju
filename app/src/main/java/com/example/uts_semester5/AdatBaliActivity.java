package com.example.uts_semester5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdatBaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_bali);
    }

    public void hal_katalog(View view) {
        Intent intent =new Intent(AdatBaliActivity.this, KatalogBajuActivity.class);
        startActivity(intent);
    }

    public void hal_sewa(View view) {
        Intent intent =new Intent(AdatBaliActivity.this, SewaBajuActivity.class);
        startActivity(intent);
    }
}