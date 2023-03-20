package com.example.projectmain.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectmain.Class.ImageClass;
import com.example.projectmain.R;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ImageClass imgC = imageList.get(i);
        img.setImageResource(imgC.getResource());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View v){
            super(v);
            img = v.findViewById(R.id.ivImage);
        }
    }
    private ArrayList<ImageClass> imageList;
    ImageView img;
    Context context;
    public ImageAdapter(@NonNull Context context, ArrayList<ImageClass> i) {
        super();
        this.context = context;
        imageList = i;
    }

}
