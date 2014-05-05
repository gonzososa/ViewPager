package com.gmail.gonzaloantonio.examples.viewpager2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFragmentPageAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public MyFragmentPageAdapter (FragmentManager fm) {
        super (fm);
        fragments = new ArrayList<Fragment> ();
    }

    public void addFragment (Fragment fragment) {
        fragments.add (fragment);
    }

    public Fragment getItem (int arg0) {
        return fragments.get (arg0);
    }

    public int getCount () {
        return fragments.size ();
    }
}
