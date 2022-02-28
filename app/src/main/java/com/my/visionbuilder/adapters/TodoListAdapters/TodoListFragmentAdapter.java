package com.my.visionbuilder.adapters.TodoListAdapters;

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
import com.my.visionbuilder.fragments.TodoList.CompletedFragment;
import com.my.visionbuilder.fragments.TodoList.PendingFragment;

public class TodoListFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public TodoListFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PendingFragment();
            case 1:
                return new CompletedFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getResources().getString(R.string.text_Pending);
            case 1:
                return context.getResources().getString(R.string.text_Completed);
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
