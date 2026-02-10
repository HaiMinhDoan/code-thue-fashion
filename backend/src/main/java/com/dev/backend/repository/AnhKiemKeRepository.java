package com.dev.backend.repository;

import com.dev.backend.entities.AnhKiemKe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AnhKiemKeRepository extends JpaRepository<AnhKiemKe, Integer>, JpaSpecificationExecutor<AnhKiemKe> {
}