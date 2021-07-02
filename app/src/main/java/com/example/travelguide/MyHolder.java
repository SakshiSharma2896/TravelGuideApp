package com.example.travelguide;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mimageTv;
    TextView mtitleTv;
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mimageTv= itemView.findViewById(R.id.modelImageTv);
        this.mtitleTv= itemView.findViewById(R.id.modelTitleTv);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public  void setItemClickListener(ItemClickListener ic){
        this.itemClickListener= ic;
    }
}
