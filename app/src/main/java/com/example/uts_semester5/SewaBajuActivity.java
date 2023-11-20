package com.example.uts_semester5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SewaBajuActivity extends AppCompatActivity {

    int hargaSewa, jmlLamaSewa, ttlHargaSewa, jmlUang;
    String sNamaPenyewa;

    Spinner adListBaju;
    TextView hargaSewaTextView;
    EditText lamaSewaEditText, uangBayarEditText, namaPenyewaEditText;

    String listBaju[] = {"Baju Adat Sunda", "Baju Adat Jawa", "Baju Adat Padang", "Baju Adat Batak", "Baju Adat Betawi", "Baju Adat Padang", "Baju Adat Bali", "Baju Adat Papua", "Baju Adat Kalimantan","Baju Adat Sulawesi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa_baju);
        namaPenyewaEditText = findViewById(R.id.nama_penyewa);
        adListBaju = findViewById(R.id.ad_listbaju);
        hargaSewaTextView = findViewById(R.id.harga_sewa_baju);
        lamaSewaEditText = findViewById(R.id.lama_sewa);
        uangBayarEditText = findViewById(R.id.uangbayar);

        ArrayAdapter<String> adBaju = new ArrayAdapter<>(SewaBajuActivity.this, android.R.layout.simple_spinner_dropdown_item, listBaju);
        adListBaju.setAdapter(adBaju);
    }

    public void tmbl_OK(View view) {
        try {
            jmlLamaSewa = Integer.parseInt(lamaSewaEditText.getText().toString());
            sNamaPenyewa = namaPenyewaEditText.getText().toString();

            int hargaSewaBaju = 0;
            if (adListBaju.getSelectedItem().toString().equals("Baju Adat Sunda")) {
                hargaSewaBaju = 200000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Jawa")) {
                hargaSewaBaju = 400000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Batak")) {
                hargaSewaBaju = 400000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Betawi")) {
                hargaSewaBaju = 200000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Padang")) {
                hargaSewaBaju = 200000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Bali")) {
                hargaSewaBaju = 400000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Papua")) {
                hargaSewaBaju = 400000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Kalimantan")) {
                hargaSewaBaju = 200000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Lampung")) {
                hargaSewaBaju = 200000;
            } else if (adListBaju.getSelectedItem().toString().equals("Baju Adat Sulawesi")) {
                hargaSewaBaju = 200000;
            }

            ttlHargaSewa = jmlLamaSewa * hargaSewaBaju;
            hargaSewaTextView.setText(String.valueOf(ttlHargaSewa));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show();
        }
    }

    public void tombol_sewa2(View view) {
            jmlUang = Integer.parseInt(uangBayarEditText.getText().toString());
            if (jmlUang < ttlHargaSewa) {
                Toast.makeText(this, "Uang Kurang", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(SewaBajuActivity.this, StrukActivity.class);

                intent.putExtra("nama", sNamaPenyewa);
                intent.putExtra("baju", adListBaju.getSelectedItem().toString());
                intent.putExtra("lama", jmlLamaSewa);
                intent.putExtra("total", ttlHargaSewa);
                intent.putExtra("uang", jmlUang);
                intent.putExtra("kembalian", jmlUang - ttlHargaSewa);

                startActivity(intent);
            }
    }

    public void hal_utama(View view) {
        Intent intent = new Intent(SewaBajuActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
