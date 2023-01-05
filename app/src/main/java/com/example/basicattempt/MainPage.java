package com.example.basicattempt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.basicattempt.ui.main.HomeFragment;
import com.example.basicattempt.ui.main.banga;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainPage extends AppCompatActivity {

    HomeFragment homeFragment = new HomeFragment();
    banga newbanga = new banga();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navi);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);
        getSupportFragmentManager().beginTransaction().replace(com.google.android.material.R.id.container, homeFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.news);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);
        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch(item.getItemId())
            {
                case R.id.home:

                    getSupportFragmentManager().beginTransaction().replace(com.google.android.
                            material.R.id.container, homeFragment).commit();
                    return true;
                case R.id.news:
                    getSupportFragmentManager().beginTransaction().replace(com.
                            google.android.material.R.id.container, newbanga).commit();
                    return true;
                case R.id.acts:


                    return true;

            }
            return false;

        });

    }
}