package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.PhieuDieuChinhKho;
import com.dev.backend.repository.PhieuDieuChinhKhoRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuDieuChinhKhoService extends BaseServiceImpl<PhieuDieuChinhKho, Integer> {

    @Autowired
    private EntityManager entityManager;

    public PhieuDieuChinhKhoService(PhieuDieuChinhKhoRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
