package com.dev.backend.services.impl.entities;

import com.dev.backend.entities.ThanhVienKiemKe;
import com.dev.backend.repository.ThanhVienKiemKeRepository;
import com.dev.backend.services.impl.BaseServiceImpl;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThanhVienKiemKeService extends BaseServiceImpl<ThanhVienKiemKe, Integer> {

    @Autowired
    private EntityManager entityManager;

    public ThanhVienKiemKeService(ThanhVienKiemKeRepository repository) {
        super(repository);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
