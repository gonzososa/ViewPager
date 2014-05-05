package com.gmail.gonzaloantonio.examples.viewpager1;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    ViewPager pager;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_main);

        pager = (ViewPager) findViewById (R.id.pager);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter (getSupportFragmentManager ());

        int blueScreen = getResources().getColor (R.color.android_blue);
        int purpleScreen = getResources().getColor (R.color.android_purple);
        int greenScreen = getResources().getColor (R.color.android_green);
        int yellowScreen = getResources().getColor (R.color.android_yellow);
        int redScreen = getResources().getColor (R.color.android_red);

        ScreenSlidePageFragment fragment = ScreenSlidePageFragment.newInstance (blueScreen, 0);
        adapter.addFragment (fragment);

        fragment = ScreenSlidePageFragment.newInstance (purpleScreen, 1);
        adapter.addFragment (fragment);

        fragment = ScreenSlidePageFragment.newInstance (greenScreen, 2);
        adapter.addFragment (fragment);

        fragment = ScreenSlidePageFragment.newInstance (yellowScreen, 3);
        adapter.addFragment (fragment);

        fragment = ScreenSlidePageFragment.newInstance (redScreen, 4);
        adapter.addFragment (fragment);
        //adapter.addFragment (ScreenSlidePageFragment.newInstance (getResources().getColor (R.color.android_blue), 0));

        pager.setAdapter (adapter);
    }

    @Override
    public void onBackPressed () {
        if (this.pager.getCurrentItem() == 0) {
            super.onBackPressed ();
        }
        else {
            this.pager.setCurrentItem (this.pager.getCurrentItem() - 1);
        }
    }

}
