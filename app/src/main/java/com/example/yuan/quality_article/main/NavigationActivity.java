package com.example.yuan.quality_article.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;


import com.example.yuan.quality_article.adapter.PagerAdapter;
import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.base.BaseActivity;

import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by jarvis yuen
 * Date: 2019/9/2
 */
public class NavigationActivity extends BaseActivity {

    @BindView(R.id.bottom_tab_layout)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar.setTitle(R.string.tab_name_1);
        fragmentList = new LinkedList<>();
        fragmentList.add(new RecomFragment());
        fragmentList.add(new SearchFragment());
        fragmentList.add(new FunReadFragment());
        initView();
        Log.d(TAG, "onCreate: ");
    }

    protected int getContentView() {
        return R.layout.activity_navigation;
    }

    private void initView() {
        initViewPager();
        initBottomNavigationView();
    }

    private void initViewPager() {
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), fragmentList));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                bottomNavigationView.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), fragmentList));
    }

    private void initBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.recommend:
                        viewPager.setCurrentItem(0);
                        toolbar.setTitle(R.string.tab_name_1);
                        break;
                    case R.id.search:
                        viewPager.setCurrentItem(1);
                        toolbar.setTitle(R.string.tab_name_2);
                        break;
                    case R.id.read:
                        viewPager.setCurrentItem(2);
                        toolbar.setTitle(R.string.tab_name_3);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
