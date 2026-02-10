package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.ChiTietPhieuDieuChinh;
import com.dev.backend.repository.ChiTietPhieuDieuChinhRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietPhieuDieuChinhService extends BaseServiceImpl<ChiTietPhieuDieuChinh, Integer> {

    @Autowired
    private EntityManager entityManager;

    public ChiTietPhieuDieuChinhService(ChiTietPhieuDieuChinhRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
