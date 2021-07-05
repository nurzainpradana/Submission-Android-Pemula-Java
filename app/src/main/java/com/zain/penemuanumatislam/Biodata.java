package com.zain.penemuanumatislam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Biodata extends AppCompatActivity {
    public static final String EXTRA_JUDUL = "extra_judul";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        String judul = getIntent().getStringExtra(EXTRA_JUDUL);

        setActionbarTitle(judul);
    }

    private void setActionbarTitle(String judul){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(judul);
        }
    }
}
