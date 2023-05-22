package com.projeto.aegis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.aegis.api.model.Entity.Empreendedor;

@Repository
public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Long>{
    
}
