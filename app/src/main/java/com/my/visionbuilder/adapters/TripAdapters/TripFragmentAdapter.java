package com.my.visionbuilder.adapters.TripAdapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Meetings.UpcomingFragment;
import com.my.visionbuilder.fragments.Trips.ActiveTripsFragment;
import com.my.visionbuilder.fragments.Trips.HistoryTripsFragment;
import com.my.visionbuilder.fragments.Trips.UpcomingTripsFragment;

public class TripFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public TripFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ActiveTripsFragment();
            case 1:
                return new UpcomingTripsFragment();
            case 2:
                return new HistoryTripsFragment();
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
                return context.getResources().getString(R.string.text_active);
            case 1:
                return context.getResources().getString(R.string.text_upcoming);
            case 2:
                return context.getResources().getString(R.string.text_history);
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
