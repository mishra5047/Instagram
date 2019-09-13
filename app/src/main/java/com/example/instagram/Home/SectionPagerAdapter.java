package com.example.instagram.Home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {

private final List<Fragment> mfragmentList = new ArrayList<>();
    SectionPagerAdapter(@NonNull FragmentManager fm) {
super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
public void addFragment(Fragment fragment){
        mfragmentList.add(fragment);
}
}
