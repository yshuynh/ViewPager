package com.example.it4.viewpager;

public class SinhVien {

    private CharSequence hoTen;
    private CharSequence email;

    public SinhVien(CharSequence hoTen, CharSequence email) {
        this.hoTen = hoTen;
        this.email = email;
    }

    public CharSequence getHoTen() {
        return hoTen;
    }

    public void setHoTen(CharSequence hoTen) {
        this.hoTen = hoTen;
    }

    public CharSequence getEmail() {
        return email;
    }

    public void setEmail(CharSequence email) {
        this.email = email;
    }
}
