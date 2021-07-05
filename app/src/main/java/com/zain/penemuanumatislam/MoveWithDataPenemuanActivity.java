package com.zain.penemuanumatislam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.zain.penemuanumatislam.adapter.ListPenemuanAdapter;
import com.zain.penemuanumatislam.model.Penemuan;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MoveWithDataPenemuanActivity extends AppCompatActivity {
    public static final String EXTRA_JUDUL = "extra_judul";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data_penemuan);

        ImageView ivPhoto = findViewById(R.id.ivPhoto);
        TextView tvJudul = findViewById(R.id.tvJudul);
        TextView tvDetail = findViewById(R.id.tvDetail);

        String judul = getIntent().getStringExtra(EXTRA_JUDUL);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO,0);

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(300,300))
                .into(ivPhoto);


        tvJudul.setText(judul);
        tvDetail.setText(detail);

        setActionbarTitle(judul);
    }

    private void setActionbarTitle(String judul){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(judul);
        }
    }

}
