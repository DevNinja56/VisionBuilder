package com.my.visionbuilder.adapters.InsuranceAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Insurance.InsuranceTransactionsActivity;
import com.my.visionbuilder.activities.Finance.Insurance.InsuranceTransactionsDetailsActivity;
import com.my.visionbuilder.models.Insurance;
import com.my.visionbuilder.models.InsuranceTransaction;

import java.util.ArrayList;

public class InsuranceTransactionsAdapter extends RecyclerView.Adapter<InsuranceTransactionsAdapter.MyViewHolder>{
    Context context;
    ArrayList<InsuranceTransaction> list;
    private InsuranceTransactionsAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(InsuranceTransactionsAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public InsuranceTransactionsAdapter(Context context, ArrayList<InsuranceTransaction> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public InsuranceTransactionsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InsuranceTransactionsAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.insurance_transaction_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final InsuranceTransactionsAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, InsuranceTransactionsDetailsActivity.class));
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
