package com.timmyg.instaclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScrollingAdapter extends RecyclerView.Adapter<ScrollingAdapter.ScrollViewHolder> {

    private Context context;
    private List<HumanityEndModel> model;

    public ScrollingAdapter(Context context, List<HumanityEndModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ScrollViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ScrollViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScrollViewHolder holder, int position) {
    holder.imageView.setImageResource(model.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ScrollViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;


        public ScrollViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_for_card);
        }
    }

}
