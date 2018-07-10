package com.example.system.adaptermvp.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.system.adaptermvp.R;

import java.util.List;

public class MvpAdapter extends RecyclerView.Adapter<MvpAdapter.ViewHolder> {

    private Context context;
    private List<Model> list;

    public MvpAdapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.hello.setText(list.get(position).getHello());
        holder.world.setText(list.get(position).getWorld());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView hello;
        TextView world;

        public ViewHolder(View itemView) {
            super(itemView);
            hello = itemView.findViewById(R.id.hello);
            world = itemView.findViewById(R.id.world);
        }
    }
}
