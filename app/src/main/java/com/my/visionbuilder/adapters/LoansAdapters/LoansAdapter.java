package com.my.visionbuilder.adapters.LoansAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.LoansAdapters.LoansAdapter;
import com.my.visionbuilder.models.Loan;

import java.util.ArrayList;

public class LoansAdapter extends RecyclerView.Adapter<LoansAdapter.MyViewHolder>{
    Context context;
    ArrayList<Loan> list;
    private LoansAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(LoansAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public LoansAdapter(Context context, ArrayList<Loan> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public LoansAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LoansAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.loan_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final LoansAdapter.MyViewHolder holder, final int position) {
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        //        TextView goal_For, goal_Details;
//        RelativeLayout goal_Item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            goal_For = itemView.findViewById(R.id.goal_For);
//            goal_Details = itemView.findViewById(R.id.goal_Details);
//            goal_Item = itemView.findViewById(R.id.goal_Item);
//            goal_Item.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(mListener != null){
//                        int position = getAdapterPosition();
//                        if(position != RecyclerView.NO_POSITION){
//                            mListener.onItemClick(position);
//                        }
//                    }
//                }
//            });
        }
    }
}
