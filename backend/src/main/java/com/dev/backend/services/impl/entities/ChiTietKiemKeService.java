package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.ChiTietKiemKe;
import com.dev.backend.repository.ChiTietKiemKeRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietKiemKeService extends BaseServiceImpl<ChiTietKiemKe, Integer> {
    @Autowired
    private EntityManager entityManager;

    public ChiTietKiemKeService(ChiTietKiemKeRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
