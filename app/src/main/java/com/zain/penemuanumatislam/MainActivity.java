package com.zain.penemuanumatislam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.zain.penemuanumatislam.adapter.ListPenemuanAdapter;
import com.zain.penemuanumatislam.model.Penemuan;
import com.zain.penemuanumatislam.model.PenemuanData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPenemuan;

    private ArrayList<Penemuan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPenemuan = findViewById(R.id.rv_penemuan);
        rvPenemuan.setHasFixedSize(true);

        list.addAll(PenemuanData.getListData());
        showRecyclerList();
    }


    private void showSelectedPenemuan(Penemuan penemuan){
        String judul = penemuan.getNamapenemuan();
        String detail = penemuan.getDetailpenemuan();
        int photo = penemuan.getPhotoPenemuan();

        Intent moveActivityDetail = new Intent(MainActivity.this, MoveWithDataPenemuanActivity.class);
        moveActivityDetail.putExtra(MoveWithDataPenemuanActivity.EXTRA_JUDUL, judul);
        moveActivityDetail.putExtra(MoveWithDataPenemuanActivity.EXTRA_DETAIL, detail);
        moveActivityDetail.putExtra(MoveWithDataPenemuanActivity.EXTRA_PHOTO, photo);

        startActivity(moveActivityDetail);

    }

    private void showRecyclerList() {
        rvPenemuan.setLayoutManager(new LinearLayoutManager(this));
        final ListPenemuanAdapter listPenemuanAdapter = new ListPenemuanAdapter(list);
        rvPenemuan.setAdapter(listPenemuanAdapter);

        listPenemuanAdapter.setOnItemClickCallback(new ListPenemuanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Penemuan data) {
                showSelectedPenemuan(data);
            }
        });
    }

    private void moveBiodata(){
        String judul = "Tentang Saya";

        Intent intentMoveBiodata = new Intent(MainActivity.this, Biodata.class);
        intentMoveBiodata.putExtra(Biodata.EXTRA_JUDUL, judul);
        startActivity(intentMoveBiodata);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_tentang_saya:
                moveBiodata();
                break;

        }
    }




}
