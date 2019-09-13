package com.example.instagram.Home;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.instagram.R;
import com.example.instagram.Utils.BottomNavViewHelper;
import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends FragmentActivity {
private static final String TAG = "HomeActivity";
private static final int ACT_NUM = 0;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"on create starting");
        setupBottomView();
        setupViewPager();
    }

    private void setupViewPager()
    {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new CameraFragment());
    adapter.addFragment(new HomeFragment());
    adapter.addFragment(new MessageFragment());
    ViewPager pager1 = (ViewPager) findViewById(R.id.containernew);
    pager1.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager1);
    tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
    tabLayout.getTabAt(1).setIcon(R.drawable.logo_insta);
    tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
    }
    private void setupBottomView(){
        Log.d(TAG,"starting");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomViewBar);
        BottomNavViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavViewHelper.enableNavigation(HomeActivity.this,bottomNavigationViewEx);

      Menu menu = bottomNavigationViewEx.getMenu();
      MenuItem menuItem = menu.getItem(ACT_NUM);
      menuItem.setChecked(true);


    }

}
