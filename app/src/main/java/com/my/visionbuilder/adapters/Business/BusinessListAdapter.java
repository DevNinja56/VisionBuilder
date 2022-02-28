package com.my.visionbuilder.adapters.Business;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Business.BusinessDetailsActivity;
import com.my.visionbuilder.models.Business;
import java.util.ArrayList;

public class BusinessListAdapter extends RecyclerView.Adapter<BusinessListAdapter.MyViewHolder>{
    Context context;
    ArrayList<Business> list;
    private BusinessListAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(BusinessListAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public BusinessListAdapter(Context context, ArrayList<Business> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public BusinessListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BusinessListAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.business_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final BusinessListAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BusinessDetailsActivity.class);
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


