package edu.lclark.tabdemoapp;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ntille on 3/3/16.
 */
public class TabDemoFragment extends Fragment {

    public static final String ARG_COLOR = "Color";
    public static final String ARG_INDEX = "Index";


    public static TabDemoFragment newInstance(@ColorInt int color, int index) {
        TabDemoFragment fragment = new TabDemoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR, color);
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_demo, container, false);

        Bundle args = getArguments();

        int index = args.getInt(ARG_INDEX);
        @ColorInt int color = args.getInt(ARG_COLOR);

        rootView.setBackgroundColor(color);

        Log.d("TabDemoFragment", "Created fragment at index " + index);

        return rootView;
    }
}
