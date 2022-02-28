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
import com.my.visionbuilder.activities.Finance.Income.EarnedIncome.EarnedIncomeActivity;
import com.my.visionbuilder.activities.Finance.Income.IncomeDetailsActivity;
import com.my.visionbuilder.activities.Finance.Income.IncomeTimelineActivity;
import com.my.visionbuilder.models.Income;
import com.my.visionbuilder.models.IncomeType;

import java.util.ArrayList;

public class IncomeTypeAdapter extends RecyclerView.Adapter<IncomeTypeAdapter.MyViewHolder>{
    Context context;
    ArrayList<IncomeType> list;
//    String income_Type;
    private IncomeTypeAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(IncomeTypeAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public IncomeTypeAdapter(Context context, ArrayList<IncomeType> list) {
        this.context = context;
        this.list = list;
//        this.income_Type = income_Type;
    }
    @NonNull
    @Override
    public IncomeTypeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IncomeTypeAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.income_type_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final IncomeTypeAdapter.MyViewHolder holder, final int position) {
        holder.income_Type.setText(list.get(position).getIncome_Type());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String income_Type = list.get(position).getIncome_Type();
                if (income_Type.equals("Earned Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Profit Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Interests Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Dividend Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Rental Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Capital Gains Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                } else if (income_Type.equals("Royalty Income")) {
                    Intent intent = new Intent(context, EarnedIncomeActivity.class);
                    intent.putExtra("INCOME_TYPE", income_Type);
                    context.startActivity(intent);
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView income_Type;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            income_Type = itemView.findViewById(R.id.income_Type);
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

