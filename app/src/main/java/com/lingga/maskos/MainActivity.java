package com.lingga.maskos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // MENGHUBUNGKAN LAYOUT DENGAN MAINACTIVITY
        setContentView(R.layout.splash_screen_logo);

        // MENANGANI DURASI UNTUK MAIN AKTIVITY AGAR PINDAH KE CLASS LIST RESEP
            // INISIALISASI HANDLER
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // DEKLARASI INTENT DENGAN SET TUJUAN CLASS SETELAH DELAY BERAKHIR
                Intent i = new Intent(MainActivity.this, ListResep.class);
                startActivity(i);
                finish();
            }
            // MEMBERI NILAI DELAY DENGAN MILI DETIK
        }, 3000);
    }
}