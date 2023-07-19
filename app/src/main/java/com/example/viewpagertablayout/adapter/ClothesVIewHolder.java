package com.example.viewpagertablayout.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpagertablayout.R;

public class ClothesVIewHolder extends RecyclerView.ViewHolder {
     ImageView clothesImage;
     TextView title,viewCount;
    public ClothesVIewHolder( View itemView) {
        super(itemView);
        clothesImage=itemView.findViewById(R.id.clothingImage);
        title=itemView.findViewById(R.id.title);
        viewCount=itemView.findViewById(R.id.clothingViewCount);
    }
}
