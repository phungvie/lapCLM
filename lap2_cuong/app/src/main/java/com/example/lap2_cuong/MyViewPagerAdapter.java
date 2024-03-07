package com.example.lap2_cuong;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lap2_cuong.fragment.ChiTiet;
import com.example.lap2_cuong.fragment.Sua;


public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChiTiet();
            case 1:
                return new Sua();
            default:
                return new ChiTiet();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
