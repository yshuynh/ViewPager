package com.example.it4.viewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    ArrayList<SinhVien> sinhVienList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createSinhVienList();
        viewPager = findViewById(R.id.viewpager_layout);
        pagerAdapter = new ViewPagerCustomAdapter(getSupportFragmentManager(), sinhVienList);
        viewPager.setAdapter(pagerAdapter);
    }

    private void createSinhVienList() {
        sinhVienList = new ArrayList<SinhVien>();
        sinhVienList.add(new SinhVien("Nguyen Van A", "nguyenvana@gmail.com"));
        sinhVienList.add(new SinhVien("Nguyen Van B", "nguyenvanb@gmail.com"));
        sinhVienList.add(new SinhVien("Nguyen Van C", "nguyenvanc@gmail.com"));
        sinhVienList.add(new SinhVien("Nguyen Van D", "nguyenvand@gmail.com"));
        sinhVienList.add(new SinhVien("Nguyen Van E", "nguyenvane@gmail.com"));
    }
}
