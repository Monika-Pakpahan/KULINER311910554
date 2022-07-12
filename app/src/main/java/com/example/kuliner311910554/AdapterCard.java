package com.example.kuliner311910554;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {

    public AdapterCard(ArrayList<ModelKuliner> datakuliner) {
        this.datakuliner = datakuliner;
    }

    private ArrayList<ModelKuliner> datakuliner;

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModelKuliner kulinermodel = datakuliner.get(position);

        holder.tvNamaKuliner.setText(kulinermodel.getNama());
        holder.tvTentangKuliner.setText(kulinermodel.getTentang());

    }

    @Override
    public int getItemCount() {
        return datakuliner.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{

        ImageView ivKuliner;
        TextView tvNamaKuliner, tvTentangKuliner;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            ivKuliner = itemView.findViewById(R.id.iv_card_foto);
            tvNamaKuliner = itemView.findViewById(R.id.tv_card_nama);
            tvTentangKuliner = itemView.findViewById(R.id.tv_card_tentang);
        }
    }
}
