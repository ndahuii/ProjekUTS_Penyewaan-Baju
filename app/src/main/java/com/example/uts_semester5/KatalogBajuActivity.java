package com.example.uts_semester5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

 public class KatalogBajuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
    }

     public void bajujawa(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatJawaActivity.class);
         startActivity(intent);
     }

     public void bajusunda(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatSundaActivity.class);
         startActivity(intent);
     }

     public void bajubatak(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatBatakActivity.class);
         startActivity(intent);
     }

     public void bajubetawi(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatBetawiActivity.class);
         startActivity(intent);
     }

     public void bajupadang(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatPadangActivity.class);
         startActivity(intent);
     }

     public void bajubali(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatBaliActivity.class);
         startActivity(intent);
     }

     public void bajupapua(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatPapuaActivity.class);
         startActivity(intent);
     }

     public void bajukalimantan(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatKalimantanActivity.class);
         startActivity(intent);
     }

     public void bajulampung(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatLampungActivity.class);
         startActivity(intent);
     }

     public void bajusulawesi(View view) {
         Intent intent =new Intent(KatalogBajuActivity.this, AdatSulawesiActivity.class);
         startActivity(intent);
     }
 }