package com.my.visionbuilder.adapters.Education.School;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Education.School.TeacherDetailsActivity;
import com.my.visionbuilder.activities.Goals.GoalDetailsActivity;
import com.my.visionbuilder.models.School;
import com.my.visionbuilder.models.Teacher;

import java.util.ArrayList;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.MyViewHolder>{
    Context context;
    ArrayList<Teacher> list;
    private TeacherAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(TeacherAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public TeacherAdapter(Context context, ArrayList<Teacher> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public TeacherAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TeacherAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.teacher_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final TeacherAdapter.MyViewHolder holder, final int position) {
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TeacherDetailsActivity.class);
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
