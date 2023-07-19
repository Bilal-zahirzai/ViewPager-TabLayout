package com.example.viewpagertablayout.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.viewpagertablayout.ClothesFragment;

public class ClothesViewPagerAdapter extends FragmentPagerAdapter {
    public ClothesViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ClothesFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "مشاهده شده ها";
            case 1:
                return "پر بازدید شده ها";
            case 2 :
                return "جدید ترین ها";
            default:
                return "";
        }
    }
}
