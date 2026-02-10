package com.dev.backend.repository;

import com.dev.backend.entities.ThanhVienKiemKe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhVienKiemKeRepository extends JpaRepository<ThanhVienKiemKe, Integer>, JpaSpecificationExecutor<ThanhVienKiemKe> {
}