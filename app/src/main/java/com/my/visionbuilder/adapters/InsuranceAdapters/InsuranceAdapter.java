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
import com.my.visionbuilder.activities.Medical.MedicalDetailsActivity;
import com.my.visionbuilder.adapters.InsuranceAdapters.InsuranceAdapter;
import com.my.visionbuilder.models.Insurance;
import com.my.visionbuilder.models.Medical;

import java.util.ArrayList;

public class InsuranceAdapter extends RecyclerView.Adapter<InsuranceAdapter.MyViewHolder>{
    Context context;
    ArrayList<Insurance> list;
    String insurance_Type;
    private InsuranceAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(InsuranceAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public InsuranceAdapter(Context context, ArrayList<Insurance> list, String insurance_Type) {
        this.context = context;
        this.list = list;
        this.insurance_Type = insurance_Type;
    }
    @NonNull
    @Override
    public InsuranceAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InsuranceAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.insurance_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final InsuranceAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(insurance_Type.equals("LIFE_INSURANCE")) {
                    Intent intent = new Intent(context, InsuranceTransactionsActivity.class);
                    intent.putExtra("INSURANCE_TYPE", "LIFE_INSURANCE");
                    context.startActivity(intent);
                } else if(insurance_Type.equals("HOUSE_INSURANCE")) {
                    Intent intent = new Intent(context, InsuranceTransactionsActivity.class);
                    intent.putExtra("INSURANCE_TYPE", "HOUSE_INSURANCE");
                    context.startActivity(intent);
                } else if(insurance_Type.equals("CAR_INSURANCE")) {
                    Intent intent = new Intent(context, InsuranceTransactionsActivity.class);
                    intent.putExtra("INSURANCE_TYPE", "CAR_INSURANCE");
                    context.startActivity(intent);
                } else if(insurance_Type.equals("OTHER_INSURANCE")) {
                    Intent intent = new Intent(context, InsuranceTransactionsActivity.class);
                    intent.putExtra("INSURANCE_TYPE", "OTHER_INSURANCE");
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
