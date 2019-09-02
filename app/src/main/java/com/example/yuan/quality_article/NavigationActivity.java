package com.example.yuan.quality_article;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import butterknife.BindView;

public class NavigationActivity extends BaseActivity {

    @BindView(R.id.bottom_tab_layout)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar.setTitle(R.string.tab_name_1);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                toolbar.setTitle(menuItem.getTitle().toString());
                return true;
            }
        });
    }

    protected int getContentView() {
        return R.layout.activity_navigation;
    }


}
