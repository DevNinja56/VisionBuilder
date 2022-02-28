package com.my.visionbuilder.adapters.Education.School;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Education.RemindersFragment;
import com.my.visionbuilder.fragments.Education.School.ClassFragment;
import com.my.visionbuilder.fragments.Education.School.TeacherFragment;
import com.my.visionbuilder.fragments.Education.SchoolFragment;
import com.my.visionbuilder.fragments.Education.TuitionFragment;

public class SchoolFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public SchoolFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ClassFragment();
            case 1:
                return new TeacherFragment();
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
                return context.getResources().getString(R.string.text_Classes);
            case 1:
                return context.getResources().getString(R.string.text_Teachers);
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
