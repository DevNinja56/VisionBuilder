package com.my.visionbuilder.adapters.InsuranceAdapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Insurance.CarInsuranceFragment;
import com.my.visionbuilder.fragments.Insurance.HouseInsuranceFragment;
import com.my.visionbuilder.fragments.Insurance.LifeInsuranceFragment;
import com.my.visionbuilder.fragments.Insurance.OtherInsuranceFragment;
import com.my.visionbuilder.fragments.Medical.FamilyFragment;
import com.my.visionbuilder.fragments.Medical.PersonalFragment;

public class InsuranceFragmentAdapter extends FragmentStatePagerAdapter {

    Context context;

    public InsuranceFragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LifeInsuranceFragment();
            case 1:
                return new HouseInsuranceFragment();
            case 2:
                return new CarInsuranceFragment();
            case 3:
                return new OtherInsuranceFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getResources().getString(R.string.title_Life);
            case 1:
                return context.getResources().getString(R.string.title_House);
            case 2:
                return context.getResources().getString(R.string.title_Car);
            case 3:
                return context.getResources().getString(R.string.title_Other);
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
