package com.projeto.aegis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.aegis.api.model.Entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
