package com.example.application.data.service;

import com.example.application.data.entity.Banque;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class BanqueService {

    private final BanqueRepository repository;

    public BanqueService(BanqueRepository repository) {
        this.repository = repository;
    }

    public Optional<Banque> get(Long id) {
        return repository.findById(id);
    }

    public Banque update(Banque entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Banque> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Banque> list(Pageable pageable, Specification<Banque> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
