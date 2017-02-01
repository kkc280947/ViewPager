package com.example.cbluser3.viewpager.acticity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cbluser3.viewpager.R;
import com.example.cbluser3.viewpager.adapter.ExamplePagerAdapter;
import com.example.cbluser3.viewpager.adapter.ScreenSlidePagerAdapter;
import com.example.cbluser3.viewpager.fragments.FirstFragment;
import com.example.cbluser3.viewpager.fragments.SecondFragment;
import com.example.cbluser3.viewpager.fragments.ThirdFragment;
import com.example.cbluser3.viewpager.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ExampleModel> elist=new ArrayList<>();
    //List<Fragment> mlist=new ArrayList<>();
    FirstFragment firstFragment=new FirstFragment();
    SecondFragment secondFragment=new SecondFragment();
    ThirdFragment thirdFragment=new ThirdFragment();
    ViewPager mPager;
    FragmentPagerAdapter fragmentPagerAdapter;
    ExamplePagerAdapter examplePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* mlist.add(firstFragment);
        mlist.add(secondFragment);
        mlist.add(thirdFragment);
*/

        elist.add(new ExampleModel("Adidas",R.drawable.logo_adidas));
        elist.add(new ExampleModel("Aerie",R.drawable.logo_aerie));
        elist.add(new ExampleModel("Alamo",R.drawable.logo_alamo));


     //   mPager=(ViewPager) findViewById(R.id.pager);
       // fragmentPagerAdapter=new ScreenSlidePagerAdapter(getSupportFragmentManager(),elist);
        //mPager.setAdapter(fragmentPagerAdapter);
        examplePagerAdapter=new ExamplePagerAdapter(this,elist);

    }
}
