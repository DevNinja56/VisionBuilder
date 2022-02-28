package com.my.visionbuilder.adapters.TripAdapters;

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
import com.my.visionbuilder.activities.Trips.TripLayoverDetailsActivity;
import com.my.visionbuilder.activities.Trips.TripLayoversActivity;
import com.my.visionbuilder.models.Trip;
import com.my.visionbuilder.models.TripLayover;

import java.util.ArrayList;

public class TripLayoversAdapter extends RecyclerView.Adapter<TripLayoversAdapter.MyViewHolder>{
    Context context;
    ArrayList<TripLayover> list;
    private TripLayoversAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(TripLayoversAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public TripLayoversAdapter(Context context, ArrayList<TripLayover> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public TripLayoversAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TripLayoversAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.trip_layover_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final TripLayoversAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TripLayoverDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView place, arrival_Time, departure_Time, date;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            place = itemView.findViewById(R.id.place);
            date = itemView.findViewById(R.id.date);
            arrival_Time = itemView.findViewById(R.id.arrival_Time);
            departure_Time = itemView.findViewById(R.id.departure_Time);
        }
    }
}