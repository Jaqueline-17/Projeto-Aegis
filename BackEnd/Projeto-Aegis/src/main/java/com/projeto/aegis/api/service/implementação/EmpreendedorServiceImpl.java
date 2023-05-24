package com.projeto.aegis.api.service.implementação;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.aegis.api.model.Dto.EmpreendedorDto;
import com.projeto.aegis.api.model.Entity.Empreendedor;
import com.projeto.aegis.api.repository.EmpreendedorRepository;
import com.projeto.aegis.api.service.IEmpreendedorService;

public class EmpreendedorServiceImpl implements IEmpreendedorService {
    
    @Autowired
    EmpreendedorRepository empreendedorRepository;

    @Override
    public Empreendedor criar(EmpreendedorDto empDto) {

        Empreendedor emp = new Empreendedor();
        emp.setNome(empDto.getNome());
        emp.setEndereco(empDto.getEndereco());
        emp.setTelefone(empDto.getTelefone());
        emp.setTipoAcesso(empDto.getTipoAcesso());
        emp.setNomeNegocio(empDto.getNomeNegocio());
        emp.setTipoNegocio(empDto.getTipoNegocio());
        emp.setAcesso(empDto.getAcesso());
        emp.setSenha(empDto.getSenha());

        return empreendedorRepository.save(emp);
    }

    @Override
    public Optional<Empreendedor> selecionarPorId(Long id) {
       return empreendedorRepository.findById(id);

    }

    @Override
    public List<Empreendedor> selecionarTodos(Long id) {
        return empreendedorRepository.findAll();
    }

    @Override
    public Empreendedor atualizar(Empreendedor emp) {
        return empreendedorRepository.save(emp); // testar esse método novamente para conferir se atualiza da forma correta.
    }

    @Override
    public void deletar(Long id) {
       empreendedorRepository.findById(id);
        empreendedorRepository.deleteById(id);
    }


}
