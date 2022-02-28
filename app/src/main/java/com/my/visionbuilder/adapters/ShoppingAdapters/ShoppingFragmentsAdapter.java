package com.my.visionbuilder.adapters.ShoppingAdapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.my.visionbuilder.R;
import com.my.visionbuilder.fragments.Shopping.ClothingFragment;
import com.my.visionbuilder.fragments.Shopping.DinningOutFragment;
import com.my.visionbuilder.fragments.Shopping.GroceriesFragment;
import com.my.visionbuilder.fragments.Shopping.HEFragment;

public class ShoppingFragmentsAdapter extends FragmentStatePagerAdapter {

    Context context;

    public ShoppingFragmentsAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new GroceriesFragment();
            case 1:
                return new DinningOutFragment();
            case 2:
                return new HEFragment();
            case 3:
                return new ClothingFragment();
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
                return context.getResources().getString(R.string.title_Groceries);
            case 1:
                return context.getResources().getString(R.string.title_DinningOut);
            case 2:
                return context.getResources().getString(R.string.title_HE);
            case 3:
                return context.getResources().getString(R.string.title_Clothing);
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