package com.dev.backend.repository;

import com.dev.backend.entities.DotKiemKe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DotKiemKeRepository extends JpaRepository<DotKiemKe, Integer>, JpaSpecificationExecutor<DotKiemKe> {
}