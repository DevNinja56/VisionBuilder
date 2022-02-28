package com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Income.IncomeDetailsActivity;
import com.my.visionbuilder.models.Income;
import com.my.visionbuilder.models.IncomeType;
import com.my.visionbuilder.models.Source;

import java.util.ArrayList;

public class IncomeItemAdapter extends RecyclerView.Adapter<IncomeItemAdapter.MyViewHolder>{
    Context context;
    ArrayList<Income> list;
    String income_Type;
    private IncomeItemAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(IncomeItemAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public IncomeItemAdapter(Context context, ArrayList<Income> list, String income_Type) {
        this.context = context;
        this.list = list;
        this.income_Type = income_Type;
    }
    @NonNull
    @Override
    public IncomeItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IncomeItemAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.income_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final IncomeItemAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, IncomeDetailsActivity.class);
                intent.putExtra("INCOME_TYPE", list.get(position).getIncome_Type());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView source_Name, date, amount, gross, net;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            source_Name = itemView.findViewById(R.id.source_Name);
            date = itemView.findViewById(R.id.date);
            amount = itemView.findViewById(R.id.amount);
            gross = itemView.findViewById(R.id.gross);
            net = itemView.findViewById(R.id.net);
            source_Name = itemView.findViewById(R.id.source_Name);
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

