package com.my.visionbuilder.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.my.visionbuilder.fragments.Login_Signup.LoginFragment;
import com.my.visionbuilder.fragments.Login_Signup.SignupFragment;

public class LoginSignupAdapter extends FragmentStatePagerAdapter {

    public LoginSignupAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LoginFragment();
            case 1:
                return new SignupFragment();
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
                return "LOGIN";
            case 1:
                return "SIGN UP";
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