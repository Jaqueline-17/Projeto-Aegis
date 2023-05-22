package com.projeto.aegis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.aegis.api.model.Entity.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    
}
