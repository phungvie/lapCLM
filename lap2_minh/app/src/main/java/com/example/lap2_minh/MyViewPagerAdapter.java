package com.example.lap2_minh;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lap2_minh.fragment.ChiTiet;
import com.example.lap2_minh.fragment.Sua;


public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Sua();
            case 1:
                return new ChiTiet();
            default:
                return new Sua();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
