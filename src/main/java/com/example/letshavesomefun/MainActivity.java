package com.example.letshavesomefun;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private int[] backgrounds;

    private ImageView background1;
    private ImageView background2;
    private ImageView background3;
    private ImageView background4;
    private ImageView background5;
    private ImageView background6;
    private ImageView background7;
    private ImageView background8;

    private WallpaperManager wallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wallpaperManager = WallpaperManager.getInstance(this);

        background1 = findViewById(R.id.background1);
        background1.setOnClickListener(this);
        background2 = findViewById(R.id.background2);
        background2.setOnClickListener(this);
        background3 = findViewById(R.id.background3);
        background3.setOnClickListener(this);
        background4 = findViewById(R.id.background4);
        background4.setOnClickListener(this);
        background5 = findViewById(R.id.background5);
        background5.setOnClickListener(this);
        background6 = findViewById(R.id.background6);
        background6.setOnClickListener(this);
        background7 = findViewById(R.id.background7);
        background7.setOnClickListener(this);
        background8 = findViewById(R.id.background8);
        background8.setOnClickListener(this);

        loadBackgrounds();
    }

    void loadBackgrounds() {
        backgrounds = new int[8];
        backgrounds[0] = R.drawable.background1;
        backgrounds[1] = R.drawable.background2;
        backgrounds[2] = R.drawable.background3;
        backgrounds[3] = R.drawable.background4;
        backgrounds[4] = R.drawable.background5;
        backgrounds[5] = R.drawable.background6;
        backgrounds[6] = R.drawable.background7;
        backgrounds[7] = R.drawable.background8;
    }

    void updateBackground(int background) {
        try {
            wallpaperManager.setResource(background);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void onClick(View view) {
        if (view == background1) {
            updateBackground(backgrounds[0]);
            return;
        }

        if (view == background2) {
            updateBackground(backgrounds[1]);
            return;
        }

        if (view == background3) {
            updateBackground(backgrounds[2]);
            return;
        }

        if (view == background4) {
            updateBackground(backgrounds[3]);
            return;
        }
            if (view == background5) {
                updateBackground(backgrounds[3]);
                return;
            }

            if (view == background6) {
                updateBackground(backgrounds[5]);
                return;
            }

            if (view == background7) {
                updateBackground(backgrounds[6]);
                return;
            }

            if (view == background8) {
                updateBackground(backgrounds[7]);
                return;
            }
        }
    }

