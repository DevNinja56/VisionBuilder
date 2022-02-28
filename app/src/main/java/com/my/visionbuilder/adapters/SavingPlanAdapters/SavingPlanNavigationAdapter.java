package com.my.visionbuilder.adapters.SavingPlanAdapters;

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
import com.my.visionbuilder.activities.SavingPlan.AutoMaintenance.AutoMaintenanceActivity;
import com.my.visionbuilder.activities.SavingPlan.AutoPayment.AutoPaymentActivity;
import com.my.visionbuilder.activities.SavingPlan.BackToSchool.BackToSchoolActivity;
import com.my.visionbuilder.activities.SavingPlan.Clothing.ClothingActivity;
import com.my.visionbuilder.activities.SavingPlan.EmergencyFund.EmergencyFundActivity;
import com.my.visionbuilder.activities.SavingPlan.Family.FamilyActivity;
import com.my.visionbuilder.activities.SavingPlan.Gas.GasActivity;
import com.my.visionbuilder.activities.SavingPlan.Gifts.GiftsActivity;
import com.my.visionbuilder.activities.SavingPlan.GivingCharities.GivingCharitiesActivity;
import com.my.visionbuilder.activities.SavingPlan.Groceries.GroceriesActivity;
import com.my.visionbuilder.activities.SavingPlan.Health.HealthActivity;
import com.my.visionbuilder.activities.SavingPlan.Holiday.HolidayActivity;
import com.my.visionbuilder.activities.SavingPlan.HomeMaintenance.HomeMaintenanceActivity;
import com.my.visionbuilder.activities.SavingPlan.HomeRemodel.HomeRemodelActivity;
import com.my.visionbuilder.activities.SavingPlan.Other.OtherActivity;
import com.my.visionbuilder.activities.SavingPlan.PersonSaving.PersonSavingActivity;
import com.my.visionbuilder.activities.SavingPlan.RentMortgage.RentMortgageActivity;
import com.my.visionbuilder.activities.SavingPlan.Spending.SpendingActivity;
import com.my.visionbuilder.activities.SavingPlan.Vacations.VacationsActivity;
import com.my.visionbuilder.activities.SavingPlan.Work.WorkActivity;
import com.my.visionbuilder.models.SavingPlanNavigation;

import java.util.ArrayList;

public class SavingPlanNavigationAdapter extends RecyclerView.Adapter<SavingPlanNavigationAdapter.MyViewHolder>{
    public static final int VIEW_TYPE_LONG = 0;
    public static final int VIEW_TYPE_SMALL = 1;
    int checkView;
    Context context;
    ArrayList<SavingPlanNavigation> list;
    private SavingPlanNavigationAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(SavingPlanNavigationAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public SavingPlanNavigationAdapter(Context context, ArrayList<SavingPlanNavigation> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public SavingPlanNavigationAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == VIEW_TYPE_LONG) {
            checkView = 1;
            return new SavingPlanNavigationAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_saving_plan_long, parent, false));
        } else {
            return new SavingPlanNavigationAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_saving_plan_small, parent, false));
        }
    }
    public void onBindViewHolder(@NonNull final SavingPlanNavigationAdapter.MyViewHolder holder, final int position) {
        switch (list.get(position).getNavigation_Title()) {
            case "Person Saving":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_HouseFinance));
                break;
            case "Emergency Fund":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_red));
                break;
            case "Rent/Mortgage":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Medical));
                break;
            case "Auto Payment":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Banking));
                break;
            case "Groceries":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Loans));
                break;
            case "Gas":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Transport));
                break;
            case "Clothing":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_TODOList));
                break;
            case "Spending":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Education));
                break;
            case "Home Remodel":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Goals));
                break;
            case "Home Maintenance":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_SavingPlan));
                break;
            case "Auto Maintenance":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Banking));
                break;
            case "Health":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_VisionPlatform));
                break;
            case "Family":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Income));
                break;
            case "Vacations":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Finance));
                break;
            case "Giving/Charities":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Loans));
                break;
            case "Holiday":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Shopping));
                break;
            case "Back To School":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.light_Color));
                break;
            case "Gifts":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Meetings));
                break;
            case "Work":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Trips));
                break;
            case "Other":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Insurance  ));
                break;
            default:
                break;
        }
        holder.navigation_Icon.setImageResource(list.get(position).getNavigation_Icon());
        holder.navigation_Title.setText(list.get(position).getNavigation_Title());
        holder.nav_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (list.get(position).getNavigation_Title()) {
                    case "Person Saving":
                        Intent intent = new Intent(context, PersonSavingActivity.class);
                        context.startActivity(intent);
                        break;
                    case "Emergency Fund":
                        Intent intent1 = new Intent(context, EmergencyFundActivity.class);
                        context.startActivity(intent1);
                        break;
                    case "Rent/Mortgage":
                        Intent intent2 = new Intent(context, RentMortgageActivity.class);
                        context.startActivity(intent2);
                        break;
                    case "Auto Payment":
                        Intent intent3 = new Intent(context, AutoPaymentActivity.class);
                        context.startActivity(intent3);
                        break;
                    case "Groceries":
                        Intent intent4 = new Intent(context, GroceriesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case "Gas":
                        Intent intent5 = new Intent(context, GasActivity.class);
                        context.startActivity(intent5);
                        break;
                    case "Clothing":
                        Intent intent6 = new Intent(context, ClothingActivity.class);
                        context.startActivity(intent6);
                        break;
                    case "Spending":
                        Intent intent7 = new Intent(context, SpendingActivity.class);
                        context.startActivity(intent7);
                        break;
                    case "Home Remodel":
                        Intent intent8 = new Intent(context, HomeRemodelActivity.class);
                        context.startActivity(intent8);
                        break;
                    case "Home Maintenance":
                        Intent intent9 = new Intent(context, HomeMaintenanceActivity.class);
                        context.startActivity(intent9);
                        break;
                    case "Auto Maintenance":
                        Intent intent10 = new Intent(context, AutoMaintenanceActivity.class);
                        context.startActivity(intent10);
                        break;
                    case "Health":
                        Intent intent11 = new Intent(context, HealthActivity.class);
                        context.startActivity(intent11);
                        break;
                    case "Family":
                        Intent intent12 = new Intent(context, FamilyActivity.class);
                        context.startActivity(intent12);
                        break;
                    case "Vacations":
                        Intent intent13 = new Intent(context, VacationsActivity.class);
                        context.startActivity(intent13);
                        break;
                    case "Giving/Charities":
                        Intent intent14 = new Intent(context, GivingCharitiesActivity.class);
                        context.startActivity(intent14);
                        break;
                    case "Holiday":
                        Intent intent15 = new Intent(context, HolidayActivity.class);
                        context.startActivity(intent15);
                        break;
                    case "Back To School":
                        Intent intent16 = new Intent(context, BackToSchoolActivity.class);
                        context.startActivity(intent16);
                        break;
                    case "Gifts":
                        Intent intent17 = new Intent(context, GiftsActivity.class);
                        context.startActivity(intent17);
                        break;
                    case "Work":
                        Intent intent18 = new Intent(context, WorkActivity.class);
                        context.startActivity(intent18);
                        break;
                    case "Other":
                        Intent intent19 = new Intent(context, OtherActivity.class);
                        context.startActivity(intent19);
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
        TextView navigation_Title, details;
        ImageView navigation_Icon;
        RelativeLayout nav_Layout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            navigation_Title = itemView.findViewById(R.id.navigation_Title);
            details = itemView.findViewById(R.id.details);
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
        if (position == 1 || position == 2 || position == 3 || position == 5 || position == 6 || position == 9 || position == 10) {
            return VIEW_TYPE_SMALL;
        } else {
            return VIEW_TYPE_LONG;
        }
    }
}