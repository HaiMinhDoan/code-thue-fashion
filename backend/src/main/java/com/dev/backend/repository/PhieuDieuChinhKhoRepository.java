package com.dev.backend.repository;

import com.dev.backend.entities.PhieuDieuChinhKho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuDieuChinhKhoRepository extends JpaRepository<PhieuDieuChinhKho, Integer>, JpaSpecificationExecutor<PhieuDieuChinhKho> {
}