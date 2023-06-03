package com.projeto.aegis.api.service;

import java.util.List;
import java.util.Optional;

import com.projeto.aegis.api.model.Dto.EmpreendedorDto;
import com.projeto.aegis.api.model.Entity.Empreendedor;

public interface IEmpreendedorService {
    
    Empreendedor criar(EmpreendedorDto empDto);

    Optional<Empreendedor> selecionarPorId(Long id);

    List<Empreendedor> selecionarTodos();

    Empreendedor atualizar(Empreendedor emp);

    void deletar(Long id);

}
