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

    private Context mContext;
    private List<Reseps> mData;

    public RecyclerViewAdapter (Context mContext,List<Reseps> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_resep, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.judulResep.setText(mData.get(i).getNamaResep());

        myHolder.img_resep_thumbnail.setImageResource(mData.get(i).getThumbnail());

        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ResepActivity.class);

                intent.putExtra("Nama", mData.get(i).getNamaResep());
                intent.putExtra("Bahan", mData.get(i).getBahanResep());
                intent.putExtra("judulresep", mData.get(i).getJudulResep());
                intent.putExtra("pembuatanresep", mData.get(i).getPembuatanResep());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView judulResep;
        CardView cardView;
        ImageView img_resep_thumbnail;


        public MyHolder(@NonNull View itemView) {
            super(itemView);

            judulResep = (TextView) itemView.findViewById(R.id.txt_namaresep);
            img_resep_thumbnail = (ImageView) itemView.findViewById(R.id.img_resep_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
