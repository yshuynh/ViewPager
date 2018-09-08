package com.example.it4.viewpager;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ViewPagerCustomAdapter extends FragmentStatePagerAdapter {

    ArrayList<SinhVien> sinhVienList;

    public ViewPagerCustomAdapter(FragmentManager fm, ArrayList<SinhVien> sinhVienList) {
        super(fm);
        this.sinhVienList = sinhVienList;
    }



    @Override
    public Fragment getItem(int i) {
        SinhVien sinhVien = sinhVienList.get(i);
        return new FragmentForViewPager(sinhVien.getHoTen(), sinhVien.getEmail());
    }

    @Override
    public int getCount() {
        return 5;
    }
}
