package com.example.application.data.service;

import com.example.application.data.entity.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BanqueRepository extends JpaRepository<Banque, Long>, JpaSpecificationExecutor<Banque> {

}
