package com.my.visionbuilder.adapters.BankingAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.models.BankingTransaction;


import java.util.ArrayList;

public class BankingTransactionAdapter extends RecyclerView.Adapter<BankingTransactionAdapter.MyViewHolder>{
    Context context;
    ArrayList<BankingTransaction> list;
    private BankingTransactionAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(BankingTransactionAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public BankingTransactionAdapter(Context context, ArrayList<BankingTransaction> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public BankingTransactionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BankingTransactionAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.banking_transaction_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final BankingTransactionAdapter.MyViewHolder holder, final int position) {
        if(list.get(position).getTransaction_Type().equals("Credit")) {
            holder.transaction_TypeImg.setImageResource(R.drawable.red_arrow_up);
        } else if(list.get(position).getTransaction_Type().equals("Credit")) {
            holder.transaction_TypeImg.setImageResource(R.drawable.down_arrow_ic);
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView transaction_Title, transaction_PersonName, transaction_Amount;
        RelativeLayout banking_TransactionItem, btn_Edit, btn_Delete;
        ImageView transaction_TypeImg;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            transaction_TypeImg = itemView.findViewById(R.id.transaction_TypeImg);
            btn_Edit = itemView.findViewById(R.id.btn_Edit);
            btn_Delete = itemView.findViewById(R.id.btn_Delete);
            transaction_Title = itemView.findViewById(R.id.transaction_Title);
            transaction_PersonName = itemView.findViewById(R.id.transaction_PersonName);
            transaction_Amount = itemView.findViewById(R.id.transaction_Amount);
            banking_TransactionItem = itemView.findViewById(R.id.banking_TransactionItem);
            banking_TransactionItem.setOnClickListener(new View.OnClickListener() {
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