package com.my.visionbuilder.adapters.VisionBuilder;

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
import com.my.visionbuilder.models.Post;

import java.util.ArrayList;

public class MyVisionBoardAdapter extends  RecyclerView.Adapter<MyVisionBoardAdapter.MyViewHolder>{
    public static final int VIEW_TYPE_LONG = 0;
    public static final int VIEW_TYPE_SMALL = 1;
    Context context;
    ArrayList<Post> list;
    private MyVisionBoardAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(MyVisionBoardAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public MyVisionBoardAdapter(Context context, ArrayList<Post> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyVisionBoardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == VIEW_TYPE_LONG) {
            return new MyVisionBoardAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.my_vision_board_long_item, parent, false));
        } else {
            return new MyVisionBoardAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.my_vision_board_long_item, parent, false));
        }
    }
    public void onBindViewHolder(@NonNull final MyVisionBoardAdapter.MyViewHolder holder, final int position) {
//        switch (list.get(position).getNavigation_Title()) {
//            case "Meetings":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Meetings));
//                break;
//            case "Todo List":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_TODOList));
//                break;
//            case "Finance":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Finance));
//                break;
//            case "Goals":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Goals));
//                break;
//            case "Business":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Business));
//                break;
//            case "Trips":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Trips));
//                break;
//            case "Contacts":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Contacts));
//                break;
//            case "Vision Platform":
//                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_VisionPlatform));
//                break;
//            default:
//                break;
//        }
//        holder.navigation_Icon.setImageResource(list.get(position).getNavigation_Icon());
//        holder.navigation_Title.setText(list.get(position).getNavigation_Title());
//        holder.number.setText(list.get(position).getNumber());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView navigation_Title, number;
        ImageView navigation_Icon;
        RelativeLayout nav_Layout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            navigation_Title = itemView.findViewById(R.id.navigation_Title);
            number = itemView.findViewById(R.id.number);
            navigation_Icon = itemView.findViewById(R.id.navigation_Icon);
            nav_Layout = itemView.findViewById(R.id.nav_Layout);
            nav_Layout.setOnClickListener(new View.OnClickListener() {
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
    @Override
    public int getItemViewType(int position) {
        if (position == 0 || position == 5 || position == 10) {
            return VIEW_TYPE_LONG;
        } else {
            return VIEW_TYPE_SMALL;
        }
    }
}
