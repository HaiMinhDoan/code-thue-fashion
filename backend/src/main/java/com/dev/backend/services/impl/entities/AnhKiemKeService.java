package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.AnhKiemKe;
import com.dev.backend.repository.AnhKiemKeRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AnhKiemKeService extends BaseServiceImpl<AnhKiemKe, Integer> {

    @Autowired
    private EntityManager entityManager;

    public AnhKiemKeService(AnhKiemKeRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
