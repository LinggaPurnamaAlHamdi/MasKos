package com.lingga.maskos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResepActivity extends AppCompatActivity {

    // MENDEKLARASIKAN PROPERTY YANG DIBUTUHKAN SESUAI LAYOUT
    private TextView mNamaResep;
    private TextView mBahanResep;
    private TextView mJudulMetodeResep;
    private TextView mPembuatanResep;
    private ImageView mgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // MENGHUBUNGKAN LAYOUT DENGAN RESEP ACTIVITY
        setContentView(R.layout.activity_resep);

        // MENGHUBUNGKAN PROPERTY YANG TELAH DI DEKLARASIKAN DENGAN SETIAP ID DI LAYOUT
        mNamaResep = (TextView)findViewById(R.id.txt_namaresep);
        mBahanResep = (TextView)findViewById(R.id.txt_bahan);
        mJudulMetodeResep = (TextView)findViewById(R.id.txt_judulmetoderesep);
        mPembuatanResep = (TextView)findViewById(R.id.txt_pembuatanresep);
        mgambar = (ImageView)findViewById(R.id.img_detailresep);

        // MEMBUAT OBJECT INTENT BARU
        Intent intent = getIntent();

        // MENGAMBIL SEMUA VARIABEL YANG DIBUAT PADA RECYCLEVIEWADAPTER
        String Nama = intent.getExtras().getString("Nama");
        String Bahan = intent.getExtras().getString("Bahan");
        String JudulMetodeResep = intent.getExtras().getString("judulmetoderesep");
        String PembuatanResep = intent.getExtras().getString("pembuatanresep");
        int Gambar = intent.getExtras().getInt("gambar");

        // MEMASUKAN DATA DARI INTENT KEDALAM PROPERTY YANG TELAH DI HUBUNGKAN DENGAN LAYOUT
        mNamaResep.setText(Nama);
        mBahanResep.setText(Bahan);
        mJudulMetodeResep.setText(JudulMetodeResep);
        mPembuatanResep.setText(PembuatanResep);
        mgambar.setImageResource(Gambar);

    }
}