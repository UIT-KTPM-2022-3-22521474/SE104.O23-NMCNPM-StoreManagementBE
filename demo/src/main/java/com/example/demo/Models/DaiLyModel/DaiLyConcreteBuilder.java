package com.example.demo.Models.DaiLyModel;

import com.example.demo.Models.daily;

public class DaiLyConcreteBuilder implements DaiLyBuilder{
    private int maDaiLy;
    private String tenDaiLy;
    private String dienThoai;
    private String diaChi;
    private int maLoaiDaiLy;
    private int maQuan;
    private String email;
    private int soNo;
    private String ngayTiepNhan;
    private int userId;


    @Override
    public DaiLyBuilder setMaDaiLy(int maDaiLy) {
        this.maDaiLy = maDaiLy;
        return this;
    }

    @Override
    public DaiLyBuilder setTenDaiLy(String tenDaiLy) {
        this.tenDaiLy = tenDaiLy;
        return this;
    }

    @Override
    public DaiLyBuilder setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
        return this;
    }

    @Override
    public DaiLyBuilder setDiaChi(String diaChi) {
        this.diaChi = diaChi;
        return this;
    }

    @Override
    public DaiLyBuilder setMaLoaiDaiLy(int maLoaiDaiLy) {
        this.maLoaiDaiLy = maLoaiDaiLy;
        return this;
    }

    @Override
    public DaiLyBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public DaiLyBuilder setMaQuan(int maQuan) {
        this.maQuan = maQuan;
        return this;
    }

    @Override
    public DaiLyBuilder setSoNo(int soNo) {
        this.soNo = soNo;
        return this;
    }

    @Override
    public DaiLyBuilder setNgayTiepNhan(String ngayTiepNhan) {
        this.ngayTiepNhan = ngayTiepNhan;
        return this;
    }

    @Override
    public DaiLyBuilder setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public daily build() {
        return new daily(maDaiLy, tenDaiLy, diaChi, dienThoai, email, maLoaiDaiLy, maQuan, ngayTiepNhan, soNo, userId);
    }
}
