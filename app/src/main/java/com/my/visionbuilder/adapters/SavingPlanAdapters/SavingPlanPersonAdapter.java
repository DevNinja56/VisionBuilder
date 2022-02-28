package com.my.visionbuilder.adapters.SavingPlanAdapters;

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
import com.my.visionbuilder.models.Auto;
import com.my.visionbuilder.models.Person;
import java.util.ArrayList;

public class SavingPlanPersonAdapter extends RecyclerView.Adapter<SavingPlanPersonAdapter.MyViewHolder>{
    Context context;
    ArrayList<Person> list;
    private SavingPlanPersonAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(SavingPlanPersonAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public SavingPlanPersonAdapter(Context context, ArrayList<Person> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public SavingPlanPersonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SavingPlanPersonAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.person_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final SavingPlanPersonAdapter.MyViewHolder holder, final int position) {
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
        //        TextView goal_For, goal_Details;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            goal_For = itemView.findViewById(R.id.goal_For);
//            goal_Details = itemView.findViewById(R.id.goal_Details);
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
