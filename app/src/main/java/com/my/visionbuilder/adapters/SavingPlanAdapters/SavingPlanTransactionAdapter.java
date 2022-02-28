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
import com.my.visionbuilder.activities.Finance.HouseFinance.HouseFinanceDetailsActivity;
import com.my.visionbuilder.activities.SavingPlan.SavingPlanTransactionDetailsActivity;
import com.my.visionbuilder.models.SavingPlanTransaction;
import java.util.ArrayList;

public class SavingPlanTransactionAdapter extends RecyclerView.Adapter<SavingPlanTransactionAdapter.MyViewHolder>{
    Context context;
    ArrayList<SavingPlanTransaction> list;
    String list_Of;
    private SavingPlanTransactionAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(SavingPlanTransactionAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public SavingPlanTransactionAdapter(Context context, ArrayList<SavingPlanTransaction> list, String list_Of) {
        this.context = context;
        this.list = list;
        this.list_Of = list_Of;
    }
    @NonNull
    @Override
    public SavingPlanTransactionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SavingPlanTransactionAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.saving_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final SavingPlanTransactionAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SavingPlanTransactionDetailsActivity.class);
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

