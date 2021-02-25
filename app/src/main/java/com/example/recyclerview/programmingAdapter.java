package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class programmingAdapter  extends RecyclerView.Adapter<programmingAdapter.ProgrammingViewHolder>{

    String[] data;
    int[] img;
    public programmingAdapter(String[] data,int[] img){
        this.data=data;
        this.img=img;

    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from((parent.getContext()));
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.titletxt.setText(title);
        int imgs=img[position];
        holder.imgicon.setImageResource(imgs);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgicon;
        TextView titletxt;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgicon=itemView.findViewById(R.id.imgicon);
            titletxt=itemView.findViewById(R.id.titletxt);

        }
    }
}
