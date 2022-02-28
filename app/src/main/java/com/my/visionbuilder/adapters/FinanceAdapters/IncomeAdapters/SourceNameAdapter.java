package com.my.visionbuilder.adapters.FinanceAdapters.IncomeAdapters;

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
import com.my.visionbuilder.activities.Finance.Income.IncomeDetailsActivity;
import com.my.visionbuilder.activities.Finance.Income.IncomeTimelineActivity;
import com.my.visionbuilder.models.Source;

import java.util.ArrayList;

public class SourceNameAdapter extends RecyclerView.Adapter<SourceNameAdapter.MyViewHolder>{
    Context context;
    ArrayList<Source> list;
    String income_Type;
    private SourceNameAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(SourceNameAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public SourceNameAdapter(Context context, ArrayList<Source> list, String income_Type) {
        this.context = context;
        this.list = list;
        this.income_Type = income_Type;
    }
    @NonNull
    @Override
    public SourceNameAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SourceNameAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.source_name_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final SourceNameAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, IncomeTimelineActivity.class);
                intent.putExtra("INCOME_TYPE", "EARNED INCOME");
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView source_Name;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
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

