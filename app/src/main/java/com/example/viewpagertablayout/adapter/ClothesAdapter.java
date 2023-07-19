package com.example.viewpagertablayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpagertablayout.R;
import com.example.viewpagertablayout.datamodel.Clothe;

import java.util.List;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesVIewHolder> {
    private Context context;
    private List<Clothe> clothes;

    public ClothesAdapter(Context context, List<Clothe> clothes){

        this.context = context;
        this.clothes = clothes;
    }
    @NonNull
    @Override
    public ClothesVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_clothing_item,parent,false);
        return new ClothesVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClothesVIewHolder holder, int position) {
        holder.clothesImage.setImageDrawable(clothes.get(position).getImage());
        holder.viewCount.setText(String.valueOf(clothes.get(position).getViewCount()));
        holder.title.setText(String.valueOf(clothes.get(position).getTitle()));


    }

    @Override
    public int getItemCount() {

        return clothes.size();
    }
}
