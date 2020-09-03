package com.example.gdgs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar  mToolbar;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private LeaderFragment mLeaderFragment;
    private SkillFragment mSkillFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mViewPager = findViewById(R.id.view_pager);
        mTabLayout = findViewById(R.id.toolbar);

        mLeaderFragment = new LeaderFragment();
        mSkillFragment = new SkillFragment();

        mTabLayout.setupWithViewPager(mViewPager);

    }
}