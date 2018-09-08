package com.example.it4.viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class FragmentForViewPager extends Fragment {

    CharSequence hoTen;
    CharSequence email;

    @SuppressLint("ValidFragment")
    public FragmentForViewPager(CharSequence hoTen, CharSequence email) {
        this.hoTen = hoTen;
        this.email = email;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_for_view_pager, container, false);

        TextView hoTenTV = view.findViewById(R.id.textView_hoten);
        TextView emailTV = view.findViewById(R.id.textView_email);

        hoTenTV.setText(hoTen);
        emailTV.setText(email);

        return view;

    }
}
