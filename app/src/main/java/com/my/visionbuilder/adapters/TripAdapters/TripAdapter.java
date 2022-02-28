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
import com.my.visionbuilder.activities.Transportation.AddPublicTransportActivity;
import com.my.visionbuilder.activities.Trips.TripLayoversActivity;
import com.my.visionbuilder.models.Transportation;
import com.my.visionbuilder.models.Trip;

import java.util.ArrayList;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.MyViewHolder>{
    Context context;
    ArrayList<Trip> list;
    private TripAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(TripAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public TripAdapter(Context context, ArrayList<Trip> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public TripAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TripAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.trips_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final TripAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TripLayoversActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView time, date, trip_From, trip_Destination;
        RelativeLayout item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item);
            time = itemView.findViewById(R.id.time);
            date = itemView.findViewById(R.id.date);
            trip_From = itemView.findViewById(R.id.trip_From);
            trip_Destination = itemView.findViewById(R.id.trip_Destination);
        }
    }
}