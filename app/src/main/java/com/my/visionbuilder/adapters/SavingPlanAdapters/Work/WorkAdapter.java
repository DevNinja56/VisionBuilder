package com.my.visionbuilder.adapters.SavingPlanAdapters.Work;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.SavingPlan.SavingPlanListActivity;
import com.my.visionbuilder.models.Vacation;
import com.my.visionbuilder.models.Work;

import java.util.ArrayList;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.MyViewHolder>{
    Context context;
    ArrayList<Work> list;
    private WorkAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(WorkAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public WorkAdapter(Context context, ArrayList<Work> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public WorkAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WorkAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.work_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final WorkAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SavingPlanListActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            item.setOnClickListener(new View.OnClickListener() {
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


