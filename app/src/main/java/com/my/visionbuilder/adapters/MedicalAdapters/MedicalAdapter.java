package com.my.visionbuilder.adapters.MedicalAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Medical.MedicalDetailsActivity;
import com.my.visionbuilder.adapters.MedicalAdapters.MedicalAdapter;
import com.my.visionbuilder.models.Medical;

import java.util.ArrayList;

public class MedicalAdapter extends RecyclerView.Adapter<MedicalAdapter.MyViewHolder>{
    Context context;
    ArrayList<Medical> list;
    private MedicalAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(MedicalAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public MedicalAdapter(Context context, ArrayList<Medical> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MedicalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MedicalAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.medical_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final MedicalAdapter.MyViewHolder holder, final int position) {
        holder.medical_Item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, MedicalDetailsActivity.class));
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        //        TextView goal_For, goal_Details;
        RelativeLayout medical_Item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            goal_For = itemView.findViewById(R.id.goal_For);
//            goal_Details = itemView.findViewById(R.id.goal_Details);
            medical_Item = itemView.findViewById(R.id.medical_Item);
            medical_Item.setOnClickListener(new View.OnClickListener() {
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
