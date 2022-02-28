package com.my.visionbuilder.adapters.GoalsAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Goals.GoalDetailsActivity;
import com.my.visionbuilder.models.Goal;

import java.util.ArrayList;

public class GoalsAdapter extends RecyclerView.Adapter<GoalsAdapter.MyViewHolder>{
    Context context;
    ArrayList<Goal> list;
    private GoalsAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(GoalsAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public GoalsAdapter(Context context, ArrayList<Goal> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.goal_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.goal_Item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GoalDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView goal_For, goal_Details;
        RelativeLayout goal_Item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            goal_For = itemView.findViewById(R.id.goal_For);
            goal_Details = itemView.findViewById(R.id.goal_Details);
            goal_Item = itemView.findViewById(R.id.goal_Item);
            goal_Item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
