package com.gmail.gonzaloantonio.examples.viewpager3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public MyFragmentPagerAdapter (FragmentManager fm) {
        super (fm);
        fragments = new ArrayList<Fragment> ();
    }

    public void addFragment (Fragment fragment) {
        fragments.add (fragment);
    }

    @Override
    public Fragment getItem (int arg0) {
        return fragments.get (arg0);
    }

    @Override
    public int getCount () {
        return fragments.size ();
    }

    @Override
    public CharSequence getPageTitle (int position) {
        return "Página " + (position + 1);
    }
}
