package edu.lclark.tabdemoapp;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ntille on 3/3/16.
 */
public class TabDemoAdapter extends FragmentPagerAdapter {


    private final Context mContext;

    public TabDemoAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        @ColorInt int[] colors = {
                Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED
        };

        return TabDemoFragment.newInstance(colors[position % 4], position);
    }

    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(R.string.tab_title_text, position);
    }
}
