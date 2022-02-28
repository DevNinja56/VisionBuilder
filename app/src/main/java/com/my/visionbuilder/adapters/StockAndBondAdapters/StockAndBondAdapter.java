package com.my.visionbuilder.adapters.StockAndBondAdapters;

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
import com.my.visionbuilder.activities.Finance.StockAndBond.StockAndBondDetailsActivity;
import com.my.visionbuilder.activities.Goals.GoalDetailsActivity;
import com.my.visionbuilder.adapters.StockAndBondAdapters.StockAndBondAdapter;
import com.my.visionbuilder.models.Goal;
import com.my.visionbuilder.models.StockAndBond;

import java.util.ArrayList;

public class StockAndBondAdapter extends RecyclerView.Adapter<StockAndBondAdapter.MyViewHolder>{
    Context context;
    ArrayList<StockAndBond> list;
    private StockAndBondAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(StockAndBondAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public StockAndBondAdapter(Context context, ArrayList<StockAndBond> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public StockAndBondAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StockAndBondAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.stock_and_bond_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final StockAndBondAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StockAndBondDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView source_Name, amount, description, date;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            source_Name = itemView.findViewById(R.id.source_Name);
            amount = itemView.findViewById(R.id.amount);
            description = itemView.findViewById(R.id.description);
            date = itemView.findViewById(R.id.date);
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
