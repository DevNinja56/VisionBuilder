package com.my.visionbuilder.adapters.SavingPlanAdapters.Vacations;

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
import com.my.visionbuilder.models.Home;
import com.my.visionbuilder.models.Vacation;

import java.util.ArrayList;

public class VacationAdapter extends RecyclerView.Adapter<VacationAdapter.MyViewHolder>{
    Context context;
    ArrayList<Vacation> list;
    private VacationAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(VacationAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public VacationAdapter(Context context, ArrayList<Vacation> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public VacationAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VacationAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.vacation_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final VacationAdapter.MyViewHolder holder, final int position) {
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

