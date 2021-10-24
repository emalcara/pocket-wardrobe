package com.emalcara.pocketwardrobe.activities;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.emalcara.pocketwardrobe.R;

public class MainActivity extends AppCompatActivity
{
    public static final int MAX_IMAGE_WIDTH_HEIGHT = 200;

    private LinearLayout topsGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        topsGallery = findViewById(R.id.topsGallery);

        addImage(R.drawable.top1);
        addImage(R.drawable.top2);
        addImage(R.drawable.top3);
        addImage(R.drawable.top4);
        addImage(R.drawable.top5);
        addImage(R.drawable.top6);
    }

    private void addImage(int resourceId)
    {
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageDrawable(ContextCompat.getDrawable(this, resourceId));
        imageView.setMaxWidth(MAX_IMAGE_WIDTH_HEIGHT);
        imageView.setMaxHeight(MAX_IMAGE_WIDTH_HEIGHT);

        topsGallery.addView(imageView);
    }
}