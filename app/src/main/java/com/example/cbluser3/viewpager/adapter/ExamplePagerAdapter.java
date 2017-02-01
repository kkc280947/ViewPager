package com.example.cbluser3.viewpager.adapter;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.cbluser3.viewpager.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 1/2/17.
 */

public class ExamplePagerAdapter extends PagerAdapter {
    
    Activity activity;
    List<ExampleModel> elist=new ArrayList<>();

    public ExamplePagerAdapter(Activity activity, List<ExampleModel> elist){

       this.activity=activity;
        this.elist=elist;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
