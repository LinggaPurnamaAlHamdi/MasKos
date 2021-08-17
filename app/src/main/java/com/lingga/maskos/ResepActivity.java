package com.lingga.maskos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResepActivity extends AppCompatActivity {

    private TextView mNamaResep;
    private TextView mBahanResep;
    private TextView mJudulMetodeResep;
    private TextView mPembuatanResep;
    private ImageView mgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        mNamaResep = (TextView)findViewById(R.id.txt_namaresep);
        mBahanResep = (TextView)findViewById(R.id.txt_bahan);
        mJudulMetodeResep = (TextView)findViewById(R.id.txt_judulmetoderesep);
        mPembuatanResep = (TextView)findViewById(R.id.txt_pembuatanresep);
        mgambar = (ImageView)findViewById(R.id.img_detailresep);

        Intent intent = getIntent();
        String Nama = intent.getExtras().getString("Nama");
        String Bahan = intent.getExtras().getString("Bahan");
        String JudulMetodeResep = intent.getExtras().getString("judulmetoderesep");
        String PembuatanResep = intent.getExtras().getString("pembuatanresep");
        int Gambar = intent.getExtras().getInt("gambar");

        mNamaResep.setText(Nama);
        mBahanResep.setText(Bahan);
        mJudulMetodeResep.setText(JudulMetodeResep);
        mPembuatanResep.setText(PembuatanResep);
        mgambar.setImageResource(Gambar);

    }
}