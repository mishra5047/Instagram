package com.example.instagram.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.instagram.Home.HomeActivity;
import com.example.instagram.Likes.LikesActivity;
import com.example.instagram.Profile.ProfileActivity;
import com.example.instagram.R;
import com.example.instagram.Search.SearchActivity;
import com.example.instagram.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG,"setting up bottom navigation view");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }

public static void enableNavigation(final Context context, BottomNavigationViewEx view)
{
    view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
           switch ((menuItem.getItemId())){
               case R.id.ic_house:
                   Intent intent1= new Intent(context, HomeActivity.class);//0
                   context.startActivity(intent1);
                   break;

               case R.id.ic_search:
                   Intent intent2 =  new Intent(context, SearchActivity.class);
                   context.startActivity(intent2);
                   break;

               case R.id.ic_circle:
                   Intent intent4 = new Intent(context, ShareActivity.class);
                   context.startActivity(intent4);
                   break;

               case R.id.ic_alert:
                   Intent intent3 = new Intent(context, LikesActivity.class);
                   context.startActivity(intent3);
                   break;


               case R.id.ic_android:
                 Intent intent5 = new Intent(context, ProfileActivity.class);
                 context.startActivity(intent5);

                   break;

           }


            return false;
        }
    });
}
}
