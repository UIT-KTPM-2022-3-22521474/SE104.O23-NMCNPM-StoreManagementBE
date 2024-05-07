package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class phieunhaphang {
    @Id
    private int maPhieuNhap;
    private String ngayNhap;
    private int tongTien;

    public phieunhaphang() {
        
    }

    public phieunhaphang(int maPhieuNhap, String ngayNhap, int tongTien) {
        this.maPhieuNhap = maPhieuNhap;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }
}
