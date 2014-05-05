package com.gmail.gonzaloantonio.examples.viewpager2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScreenSlidePageFragment extends Fragment {
    private static final String BACKGROUND_COLOR = "color";
    private static final String INDEX = "index";

    private int color;
    private int index;

    public static ScreenSlidePageFragment newInstance (int color, int index) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment ();

        Bundle bundle = new Bundle();
        bundle.putInt (BACKGROUND_COLOR, color);
        bundle.putInt (INDEX, index);

        fragment.setArguments (bundle);
        return fragment;
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onActivityCreated (savedInstanceState);

        color = (getArguments() != null) ? getArguments().getInt (BACKGROUND_COLOR) : Color.GRAY;
        index = (getArguments() != null) ? getArguments().getInt (INDEX) : -1;
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate (R.layout.fragment_screen_slide_page, container, false);

        TextView tvIndex  = (TextView) rootView.findViewById (R.id.tvIndex);
        tvIndex.setText (String.valueOf (index));

        rootView.setBackgroundColor (color);
        return rootView;
    }

}
