package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.DotKiemKe;
import com.dev.backend.repository.DotKiemKeRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DotKiemKeService extends BaseServiceImpl<DotKiemKe, Integer> {

    @Autowired
    private EntityManager entityManager;

    public DotKiemKeService(DotKiemKeRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
