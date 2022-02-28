package com.my.visionbuilder.adapters.Transportation;

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
import com.my.visionbuilder.activities.Transportation.AddPublicTransportActivity;
import com.my.visionbuilder.models.Transportation;

import java.util.ArrayList;

public class TransportationAdapter extends RecyclerView.Adapter<TransportationAdapter.MyViewHolder>{
    Context context;
    ArrayList<Transportation> list;
    String fragment;
    private TransportationAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(TransportationAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public TransportationAdapter(Context context, ArrayList<Transportation> list, String fragment) {
        this.context = context;
        this.list = list;
        this.fragment = fragment;
    }
    @NonNull
    @Override
    public TransportationAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TransportationAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.transportation_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final TransportationAdapter.MyViewHolder holder, final int position) {
        if(fragment.equals("GAS")) {
            holder.first_Heading.setText("starting point");
            holder.destination.setVisibility(View.GONE);
        } else if(fragment.equals("MAINTENANCE")) {
            holder.first_Heading.setText("maintenance for");
            holder.destination.setVisibility(View.GONE);
        } else if(fragment.equals("PUBLIC_TRANSPORTATION")) {
            holder.first_Heading.setText("maintenance for");
        }
//        holder.todolist_Title.setText(list.get(position).getTransportation_Title());
//        holder.todolist_DateTime.setText(list.get(position).getTransportation_Date() + "  |  " + list.get(position).getTransportation_Time());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddPublicTransportActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView first_Heading, destination;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            first_Heading = itemView.findViewById(R.id.first_Heading);
            destination = itemView.findViewById(R.id.destination);
//            todolist_DateTime = itemView.findViewById(R.id.todolist_DateTime);
//            todo_ListItem = itemView.findViewById(R.id.todo_ListItem);
//            todo_ListItem.setOnClickListener(new View.OnClickListener() {
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