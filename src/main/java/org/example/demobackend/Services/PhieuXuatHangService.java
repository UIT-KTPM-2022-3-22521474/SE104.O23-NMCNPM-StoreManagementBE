package org.example.demobackend.Services;

import org.example.demobackend.Models.daily;
import org.example.demobackend.Models.phieuthutien;
import org.example.demobackend.Models.phieuxuathang;
import org.example.demobackend.Repository.PhieuXuatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuXuatHangService {
    private static PhieuXuatHangRepository phieuXuatHangRepository;
    private static DaiLyService dailyService;

    @Autowired
    public PhieuXuatHangService(PhieuXuatHangRepository phieuXuatHangRepository,DaiLyService dailyService) {
        this.phieuXuatHangRepository = phieuXuatHangRepository;
        this.dailyService = dailyService;
    }

    public static phieuxuathang getPhieuXuatHangById(int mapxuat) {
        return phieuXuatHangRepository.getPhieuXuatHangById(mapxuat);
    }

    public static phieuxuathang getAllPhieuXuatHangByNgayXuat(String ngaylp) {
        return phieuXuatHangRepository.getAllPhieuXuatHangByNgayLp(ngaylp);
    }

    public static int getSoPhieuXuatByThangAndNamOfNgayLP(int thang, int nam) {
        return phieuXuatHangRepository.getSoPhieuXuatByThangAndNamOfNgayLP(thang, nam);
    }

    public static int createPhieuXuatHang(phieuxuathang newPhieuXuatHang) {
        try {
            dailyService.updateSoNo( newPhieuXuatHang.getConlai(),newPhieuXuatHang.getMadaily().getMadaily());
            phieuXuatHangRepository.save(newPhieuXuatHang);
            return newPhieuXuatHang.getMapxuat();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}