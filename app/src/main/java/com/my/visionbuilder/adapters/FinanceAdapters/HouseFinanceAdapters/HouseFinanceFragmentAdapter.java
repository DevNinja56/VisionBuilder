package com.my.visionbuilder.adapters.FinanceAdapters.HouseFinanceAdapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Finance.HouseFinance.CableBillsFragment;
import com.my.visionbuilder.fragments.Finance.HouseFinance.MaintenanceFragment;
import com.my.visionbuilder.fragments.Finance.HouseFinance.RentBillsFragment;
import com.my.visionbuilder.fragments.Goals.DailyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.MonthlyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.TenYearsGoalsFragment;
import com.my.visionbuilder.fragments.Goals.WeeklyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.YearlyGoalsFragment;

public class HouseFinanceFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public HouseFinanceFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RentBillsFragment();
            case 1:
                return new CableBillsFragment();
            case 2:
                return new MaintenanceFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getResources().getString(R.string.title_RentBills);
            case 1:
                return context.getResources().getString(R.string.title_CableBills);
            case 2:
                return context.getResources().getString(R.string.title_Maintenance);
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}