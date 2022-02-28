package com.my.visionbuilder.adapters.ShoppingAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.ShoppingAdapters.ShoppingAdapter;
import com.my.visionbuilder.models.Shopping;

import java.util.ArrayList;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.MyViewHolder>{
    Context context;
    ArrayList<Shopping> list;
    private ShoppingAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(ShoppingAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public ShoppingAdapter(Context context, ArrayList<Shopping> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public ShoppingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShoppingAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.shopping_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final ShoppingAdapter.MyViewHolder holder, final int position) {
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
