package com.my.visionbuilder.adapters.Meetings;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Meetings.AddMeetingActivity;
import com.my.visionbuilder.models.Meeting;

import java.util.ArrayList;

public class MeetingsAdapter extends RecyclerView.Adapter<MeetingsAdapter.MyViewHolder>{
    Context context;
    ArrayList<Meeting> list;
    private MeetingsAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(MeetingsAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public MeetingsAdapter(Context context, ArrayList<Meeting> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MeetingsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeetingsAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.meeting_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final MeetingsAdapter.MyViewHolder holder, final int position) {
        holder.meeting_Item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddMeetingActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        //        TextView goal_For, goal_Details;
        RelativeLayout meeting_Item;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            meeting_Item = itemView.findViewById(R.id.meeting_Item);
//            goal_Details = itemView.findViewById(R.id.goal_Details);
//            goal_Item = itemView.findViewById(R.id.goal_Item);
            meeting_Item.setOnClickListener(new View.OnClickListener() {
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
