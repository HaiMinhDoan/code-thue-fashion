package com.dev.backend.repository;

import com.dev.backend.entities.ChiTietKiemKe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietKiemKeRepository extends JpaRepository<ChiTietKiemKe, Integer>, JpaSpecificationExecutor<ChiTietKiemKe> {
}