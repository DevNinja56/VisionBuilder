package com.my.visionbuilder.adapters.FinanceAdapter;

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
import com.my.visionbuilder.activities.Finance.HouseFinance.HouseFinanceDetailsActivity;
import com.my.visionbuilder.models.RentBills;

import java.util.ArrayList;

public class RentBillAdapter extends RecyclerView.Adapter<RentBillAdapter.MyViewHolder>{
    Context context;
    ArrayList<RentBills> list;
    private RentBillAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(RentBillAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public RentBillAdapter(Context context, ArrayList<RentBills> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public RentBillAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RentBillAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.house_finance_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final RentBillAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HouseFinanceDetailsActivity.class);
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
