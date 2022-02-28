package com.my.visionbuilder.adapters.GoalsAdapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Goals.DailyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.MonthlyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.TenYearsGoalsFragment;
import com.my.visionbuilder.fragments.Goals.WeeklyGoalsFragment;
import com.my.visionbuilder.fragments.Goals.YearlyGoalsFragment;

public class GoalsFragmentsAdapter extends FragmentStatePagerAdapter {

    Context context;

    public GoalsFragmentsAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DailyGoalsFragment();
            case 1:
                return new WeeklyGoalsFragment();
            case 2:
                return new MonthlyGoalsFragment();
            case 3:
                return new YearlyGoalsFragment();
            case 4:
                return new TenYearsGoalsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getResources().getString(R.string.text_Daily);
            case 1:
                return context.getResources().getString(R.string.text_Weekly);
            case 2:
                return context.getResources().getString(R.string.text_Monthly);
            case 3:
                return context.getResources().getString(R.string.text_Yearly);
            case 4:
                return context.getResources().getString(R.string.text_TenYears);
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