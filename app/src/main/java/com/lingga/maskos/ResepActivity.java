package com.lingga.maskos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResepActivity extends AppCompatActivity {

    private TextView mNamaResep;
    private TextView mBahanResep;
    private TextView mJudulResep;
    private TextView mPembuatanResep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        mNamaResep = (TextView)findViewById(R.id.txt_namaresep);
        mBahanResep = (TextView)findViewById(R.id.txt_bahan);
        mJudulResep = (TextView)findViewById(R.id.txt_judulpembuatan);
        mPembuatanResep = (TextView)findViewById(R.id.txt_pembuatanresep);

        Intent intent = getIntent();
        String Nama = intent.getExtras().getString("NamaResep");
        String Bahan = intent.getExtras().getString("BahanResep");
        String JudulPembuatan = intent.getExtras().getString("JudulResep");
        String Pembuatan = intent.getExtras().getString("PembuatanResep");

        mNamaResep.setText(Nama);
        mBahanResep.setText(Bahan);
        mJudulResep.setText(JudulPembuatan);
        mPembuatanResep.setText(Pembuatan);

    }
}