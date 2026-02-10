package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.LichSuKiemKe;
import com.dev.backend.repository.LichSuKiemKeRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LichSuKiemKeService extends BaseServiceImpl<LichSuKiemKe, Integer> {

    @Autowired
    private EntityManager entityManager;

    public LichSuKiemKeService(LichSuKiemKeRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
