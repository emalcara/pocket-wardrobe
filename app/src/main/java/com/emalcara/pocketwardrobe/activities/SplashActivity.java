package com.emalcara.pocketwardrobe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.emalcara.pocketwardrobe.R;

public class SplashActivity extends AppCompatActivity
{
    public static final int SPLASH_SCREEN_DELAY_MS = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        new Handler().postDelayed(() -> startActivity(new Intent(this, MainActivity.class)), SPLASH_SCREEN_DELAY_MS);
    }
}