package com.my.visionbuilder.adapters.Meetings;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Medical.FamilyFragment;
import com.my.visionbuilder.fragments.Medical.PersonalFragment;
import com.my.visionbuilder.fragments.Meetings.TodayFragment;
import com.my.visionbuilder.fragments.Meetings.UpcomingFragment;

public class MeetingsFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public MeetingsFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TodayFragment();
            case 1:
                return new UpcomingFragment();
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
                return context.getResources().getString(R.string.title_Today);
            case 1:
                return context.getResources().getString(R.string.title_Upcoming);
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
