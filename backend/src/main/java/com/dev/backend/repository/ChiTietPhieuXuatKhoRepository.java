package com.dev.backend.repository;

import com.dev.backend.entities.ChiTietPhieuXuatKho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietPhieuXuatKhoRepository extends JpaRepository<ChiTietPhieuXuatKho, Integer>, JpaSpecificationExecutor<ChiTietPhieuXuatKho> {

    @Query("""
    SELECT bt.sanPham.id
    FROM ChiTietPhieuXuatKho ct
    JOIN ct.phieuXuatKho px
    JOIN ct.bienTheSanPham bt
    WHERE px.loaiXuat = 'ban_hang'
      AND px.trangThai = 1
    GROUP BY bt.sanPham.id
    ORDER BY SUM(ct.soLuongXuat) DESC
    LIMIT :top
    """)
    List<Integer> findTopSanPham(@Param("top") Integer top);
}