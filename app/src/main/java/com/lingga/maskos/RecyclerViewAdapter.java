package com.lingga.maskos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    // INISIALISASI CONTEXT DAN LIST ARRAY UNTUK KUMPULAN RESEP
    private Context mContext;
    private List<Reseps> mData;

    // MEMBUAT RECYLEVIEW UNTUK NANTI DIKIRIM KE LIST RESEP
    public RecyclerViewAdapter (Context mContext,List<Reseps> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    // MEMBUAT TAMPILAN/HOLDER/CARD SATU PERSATU UNTUK SETIAP RESEP
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_resep, viewGroup, false);
        return new MyHolder(view);
    }

    // PROSES UNTUK MEMBUAT READ SETIAP CARD PADA LIST RESEP KE DETAIL RESEP SATU PERSATU
    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.namaResep.setText(mData.get(i).getNamaResep());

        myHolder.img_resep_thumbnail.setImageResource(mData.get(i).getThumbnail());

        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // MEMBUAT INTENT UNTUK MENGHUBUNGKAN DATA DATA RESEP KE CLASS RESEP AKTIVITY UNTUK DETAIL RESEP
                Intent intent = new Intent(mContext, ResepActivity.class);

                // MEMBUAT EXTRA VARIABLE AGAR BISA DIGUNAKAN DI CLASS RESEP AKTIVITY
                intent.putExtra("gambar", mData.get(i).getThumbnail());
                intent.putExtra("Nama", mData.get(i).getNamaResep());
                intent.putExtra("Bahan", mData.get(i).getBahanResep());
                intent.putExtra("judulmetoderesep", mData.get(i).getJudulMetodeResep());
                intent.putExtra("pembuatanresep", mData.get(i).getPembuatanResep());

                // MENJALANKAN INTENT
                mContext.startActivity(intent);
            }
        });
    }

    // MENGHITUNG JUMLAH DATA YANG DIBUAT
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // MEMBUAT HOLDER SETIAP DATA UNTUK LIST RESEP
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView namaResep;
        CardView cardView;
        ImageView img_resep_thumbnail;


        public MyHolder(@NonNull View itemView) {
            super(itemView);
            // MENGAMBIL SETIAP ID YANG DIBUTUHKAN PADA VIEW LIST RESEP CLASS
            namaResep = (TextView) itemView.findViewById(R.id.txt_resep);
            img_resep_thumbnail = (ImageView) itemView.findViewById(R.id.img_resep_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
