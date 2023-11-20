package com.example.uts_semester5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdatPapuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_papua);
    }

    public void hal_katalog(View view) {
        Intent intent =new Intent(AdatPapuaActivity.this, KatalogBajuActivity.class);
        startActivity(intent);
    }

    public void hal_sewa(View view) {
        Intent intent =new Intent(AdatPapuaActivity.this, SewaBajuActivity.class);
        startActivity(intent);
    }
}