package com.example.qiaolulu.fangqi;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;


import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;

public class Market extends AppCompatActivity {
    ArrayList<String> titleDatas=new ArrayList<>();
    ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    ViewPager viewPager;
    PagerSlidingTabStrip pagerSlidingTabStrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        pagerSlidingTabStrip = findViewById(R.id.market_pst);
        viewPager = findViewById(R.id.market_vp);
        titleDatas.add("人物");
        titleDatas.add("气泡");
        titleDatas.add("贴纸");
        titleDatas.add("背景");
        fragmentList.add(new PersonFragment());
        fragmentList.add(new PopFragment());
        fragmentList.add(new PaperFragment());
        fragmentList.add(new BackgroundFragment());
        MyViewPageAdapter myViewPageAdapter = new MyViewPageAdapter(getSupportFragmentManager(), titleDatas, fragmentList);
        viewPager.setAdapter(myViewPageAdapter);
        viewPager.setCurrentItem(0);
        pagerSlidingTabStrip.setViewPager(viewPager);


    }
}
