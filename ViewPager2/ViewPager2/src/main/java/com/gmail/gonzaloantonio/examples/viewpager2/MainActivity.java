package com.gmail.gonzaloantonio.examples.viewpager2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
    ViewPager pager;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        pager = (ViewPager) findViewById (R.id.pager);

        MyFragmentPageAdapter adapter = new MyFragmentPageAdapter (getSupportFragmentManager ());

        adapter.addFragment (
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.blue), 0)
        );

        adapter.addFragment (
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.purple), 1)
        );

        adapter.addFragment (
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.green), 2)
        );

        adapter.addFragment (
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.yellow), 3)
        );

        adapter.addFragment(
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.red), 4)
        );

        pager.setAdapter (adapter);
    }

}
