package com.my.visionbuilder.adapters.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Business.BusinessActivity;
import com.my.visionbuilder.activities.Contact.ContactsActivity;
import com.my.visionbuilder.activities.Finance.FinanceActivity;
import com.my.visionbuilder.activities.Goals.GoalsActivity;
import com.my.visionbuilder.activities.Meetings.MeetingsActivity;
import com.my.visionbuilder.activities.TodoList.TodoListActivity;
import com.my.visionbuilder.activities.Trips.TripsActivity;
import com.my.visionbuilder.activities.VisionPlatform.VisionPlatformMainActivity;
import com.my.visionbuilder.models.NavigationHome;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{
    public static final int VIEW_TYPE_LONG = 0;
    public static final int VIEW_TYPE_SMALL = 1;
    Context context;
    ArrayList<NavigationHome> list;
    private HomeAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(HomeAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public HomeAdapter(Context context, ArrayList<NavigationHome> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public HomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == VIEW_TYPE_LONG) {
            return new HomeAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_long_item, parent, false));
        } else {
            return new HomeAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_small_item, parent, false));
        }
    }
    public void onBindViewHolder(@NonNull final HomeAdapter.MyViewHolder holder, final int position) {
        switch (list.get(position).getNavigation_Title()) {
            case "Meetings":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Meetings));
                break;
            case "Todo List":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_TODOList));
                break;
            case "Finance":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Finance));
                break;
            case "Goals":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Goals));
                break;
            case "Business":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Business));
                break;
            case "Trips":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Trips));
                break;
            case "Contacts":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Contacts));
                break;
            case "Vision Platform":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_VisionPlatform));
                break;
            default:
                break;
        }
        holder.navigation_Icon.setImageResource(list.get(position).getNavigation_Icon());
        holder.navigation_Title.setText(list.get(position).getNavigation_Title());
        holder.number.setText(list.get(position).getNumber());
        holder.nav_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (list.get(position).getNavigation_Title()) {
                    case "Meetings":
                        Intent intent = new Intent(context, MeetingsActivity.class);
                        context.startActivity(intent);
                        break;
                    case "Todo List":
                        Intent intent1 = new Intent(context, TodoListActivity.class);
                        context.startActivity(intent1);
                        break;
                    case "Finance":
                        Intent intent3 = new Intent(context, FinanceActivity.class);
                        context.startActivity(intent3);
                        break;
                    case "Goals":
                        Intent intent4 = new Intent(context, GoalsActivity.class);
                        context.startActivity(intent4);
                        break;
                    case "Business":
                        Intent intent5 = new Intent(context, BusinessActivity.class);
                        context.startActivity(intent5);
                        break;
                    case "Trips":
                        Intent intent6 = new Intent(context, TripsActivity.class);
                        context.startActivity(intent6);
                        break;
                    case "Contacts":
                        Intent intent7 = new Intent(context, ContactsActivity.class);
                        context.startActivity(intent7);
                        break;
                    case "Vision Platform":
                        Intent intent8 = new Intent(context, VisionPlatformMainActivity.class);
                        context.startActivity(intent8);
                        break;
                    default:
                        break;
                }
            }
        });
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
        if (position == 0 || position == 2 || position == 3) {
            return VIEW_TYPE_SMALL;
        } else {
            return VIEW_TYPE_LONG;
        }
    }
}