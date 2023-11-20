package com.example.uts_semester5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class ActivitySplashScreen extends AppCompatActivity {
    private int waktu = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(ActivitySplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu);

    }
}