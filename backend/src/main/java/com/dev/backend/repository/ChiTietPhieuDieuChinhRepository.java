package com.dev.backend.repository;

import com.dev.backend.entities.ChiTietPhieuDieuChinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuDieuChinhRepository extends JpaRepository<ChiTietPhieuDieuChinh, Integer>, JpaSpecificationExecutor<ChiTietPhieuDieuChinh> {
}