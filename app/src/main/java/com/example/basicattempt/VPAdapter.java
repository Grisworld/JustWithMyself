package com.example.basicattempt;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.basicattempt.ui.main.HomeFragment;
import com.example.basicattempt.ui.main.banga;

import java.util.ArrayList;


public class VPAdapter extends FragmentStateAdapter {

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return position == 1 ? new HomeFragment() : new banga();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
