package com.my.visionbuilder.adapters.Education;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.VisionPlatform.ui.profile.ProfileFragment;
import com.my.visionbuilder.fragments.Banking.CreditFragment;
import com.my.visionbuilder.fragments.Banking.DebitFragment;
import com.my.visionbuilder.fragments.Education.RemindersFragment;
import com.my.visionbuilder.fragments.Education.SchoolFragment;
import com.my.visionbuilder.fragments.Education.TuitionFragment;

public class EducationDetailsFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public EducationDetailsFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SchoolFragment();
            case 1:
                return new TuitionFragment();
            case 2:
                return new RemindersFragment();
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
                return context.getResources().getString(R.string.text_School);
            case 1:
                return context.getResources().getString(R.string.text_Tuition);
            case 2:
                return context.getResources().getString(R.string.text_Reminders);
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