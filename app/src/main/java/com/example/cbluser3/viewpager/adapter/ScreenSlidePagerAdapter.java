package com.example.cbluser3.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cbluser3.viewpager.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 1/2/17.
 */
public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

    List<Fragment> mlist=new ArrayList<>();


    public ScreenSlidePagerAdapter(FragmentManager fm, List<ExampleModel> mlist) {
        super(fm);
        this.mlist=mlist;
    }


    @Override
    public Fragment getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }
}
