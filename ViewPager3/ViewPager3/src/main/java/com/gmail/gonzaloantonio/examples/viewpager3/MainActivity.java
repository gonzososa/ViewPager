package com.gmail.gonzaloantonio.examples.viewpager3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends FragmentActivity {
    ViewPager pager = null;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        pager = (ViewPager) findViewById (R.id.pager);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter (getSupportFragmentManager());

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

        adapter.addFragment (
                ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.red), 4)
        );

        pager.setAdapter (adapter);

        TitlePageIndicator indicator = (TitlePageIndicator) findViewById (R.id.indicator);
        indicator.setViewPager (pager);
    }

    @Override
    public void onBackPressed () {
        if (pager.getCurrentItem () == 0) {
            super.onBackPressed ();
        } else {
          pager.setCurrentItem(pager.getCurrentItem() - 1);
        }
    }
}
