package com.my.visionbuilder.adapters.Transportation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Finance.HouseFinance.MaintenanceFragment;
import com.my.visionbuilder.fragments.Goals.DailyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.MonthlyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.TenYearsGoalsFragment;
import com.my.visionbuilder.fragments.Goals.WeeklyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.YearlyGoalsFragment;
import com.my.visionbuilder.fragments.Transportation.GasFragment;
import com.my.visionbuilder.fragments.Transportation.PublicTransportFragment;

public class TransportationFragmentsAdapter extends FragmentStatePagerAdapter {

    Context context;

    public TransportationFragmentsAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MaintenanceFragment();
            case 1:
                return new GasFragment();
            case 2:
                return new PublicTransportFragment();
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
                return context.getResources().getString(R.string.title_Maintenance);
            case 1:
                return context.getResources().getString(R.string.title_Gas);
            case 2:
                return context.getResources().getString(R.string.title_PublicTransport);
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
