package com.example.travelguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable {

    Context c;
    ArrayList<Model> models, filterList;
    CustomFilter customFilter;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
        this.filterList= models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        holder.mtitleTv.setText(models.get(position).getTilte());
        holder.mimageTv.setImageResource(models.get(position).getImage());
        Animation animation= AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);
        //use when you put each item data to same activity
      /*  holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                String title= models.get(pos).getTilte();
                BitmapDrawable bitmapDrawable= (BitmapDrawable)holder.mimageTv.getDrawable();
                Bitmap bitmap= bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream= new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes= stream.toByteArray();
                Intent intent= new Intent(c, DetailActivity.class);
                intent.putExtra("iTitle", title);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);
            }
        });*/

        //use when start another activity or perform different action
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                if (models.get(pos).getTilte().equals("Andhra Pradesh")){
                    //do something when item with title "Andhra" is clicked
                    Intent intent= new Intent(c, AndhraPradesh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Arunachal Pradesh")){
                    //do something when item with title "Arunachal" is clicked
                    Intent intent= new Intent(c, ArunachalPradesh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Assam")){
                    //do something when item with title "Assam" is clicked
                    Intent intent= new Intent(c, Assam.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Bihar")){
                    //do something when item with title "Bihar" is clicked
                    Intent intent= new Intent(c, Bihar.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Chhattisgarh")){
                    //do something when item with title "Chhattisgarh" is clicked
                    Intent intent= new Intent(c, Chattisgarh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Delhi")){
                    Intent intent= new Intent(c, Delhi.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Goa")){
                    Intent intent= new Intent(c, Goa.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Gujarat")){
                    Intent intent= new Intent(c, Gujarat.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Harayana")){
                    Intent intent= new Intent(c, Harayana.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Himachal Pradesh")){
                    Intent intent= new Intent(c, HimachalPradesh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Jammu Kashmir")){
                    Intent intent= new Intent(c, JammuKashmir.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Jharkhand")){
                    Intent intent= new Intent(c, Jharkhand.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Karnataka")){
                    Intent intent= new Intent(c, Karnataka.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Kerala")){
                    Intent intent= new Intent(c, Kerala.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Madhya Pradesh")){
                    Intent intent= new Intent(c, MadhyaPradesh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Maharashtra")){
                    Intent intent= new Intent(c, Maharashtra.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Manipur")){
                    Intent intent= new Intent(c, Manipur.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Meghalaya")){
                    Intent intent= new Intent(c, Meghalaya.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Mizoram")){
                    Intent intent= new Intent(c, Mizoram.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Nagaland")){
                    Intent intent= new Intent(c, Nagaland.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Odisha")){
                    Intent intent= new Intent(c, Odisha.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Punjab")){
                    Intent intent= new Intent(c, Punjab.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Rajasthan")){
                    Intent intent= new Intent(c, Rajasthan.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Sikkim")){
                    Intent intent= new Intent(c, Sikkim.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Tamil Nadu")){
                    Intent intent= new Intent(c, TamilNadu.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Telangana")){
                    Intent intent= new Intent(c, Telangana.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Tripura")){
                    Intent intent= new Intent(c, Tripura.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Uttarakhand")){
                    Intent intent= new Intent(c, Uttarakhand.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("Uttar Pradesh")){
                    Intent intent= new Intent(c, UttarPradesh.class);
                    c.startActivity(intent);
                }
                if (models.get(pos).getTilte().equals("West Bengal")){
                    Intent intent= new Intent(c, WestBengal.class);
                    c.startActivity(intent);
                }
            }
        });

        //any of these two mehod can be used

    }



    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public Filter getFilter() {
        if (customFilter==null){
            customFilter= new CustomFilter(filterList, this);
        }
        return customFilter;
    }
}
