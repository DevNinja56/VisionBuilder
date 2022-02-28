package com.my.visionbuilder.adapters.VisionBuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.models.User;

import java.util.ArrayList;

public class ChatUsersAdapter extends RecyclerView.Adapter<ChatUsersAdapter.MyViewHolder>{
    Context context;
    ArrayList<User> list;
    private ChatUsersAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(ChatUsersAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public ChatUsersAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public ChatUsersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatUsersAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.chat_user_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final ChatUsersAdapter.MyViewHolder holder, final int position) {
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


