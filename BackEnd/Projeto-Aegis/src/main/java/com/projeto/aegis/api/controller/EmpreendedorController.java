package com.projeto.aegis.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.aegis.api.model.Dto.EmpreendedorDto;
import com.projeto.aegis.api.model.Entity.Empreendedor;
// import com.projeto.aegis.api.repository.EmpreendedorRepository;
import com.projeto.aegis.api.service.implementação.EmpreendedorServiceImpl;

@RestController
@RequestMapping("/aegis/empreendedor")
public class EmpreendedorController {
    
    @Autowired
    private EmpreendedorServiceImpl empService;

    // @Autowired
    // private EmpreendedorRepository empRepository;

    @PostMapping
    public ResponseEntity<Empreendedor> salvar(@RequestBody EmpreendedorDto emp) {
        return new ResponseEntity<Empreendedor>(empService.criar(emp), HttpStatus.CREATED);
    }

    @PutMapping
    public Empreendedor atualizar(@RequestBody Empreendedor emp) {
        return empService.atualizar(emp);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletar(@PathVariable("id") Long id) {
        empService.deletar(id);
        return new ResponseEntity<String>("Emprreendedor Deletado.", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Empreendedor>> selecionarTodos() {
        List<Empreendedor> empreendedores = empService.selecionarTodos();
        return ResponseEntity.ok().body(empreendedores);
    }

    
    @GetMapping("{id}")
    public Optional<Empreendedor> selecionarPorId(@PathVariable("id") Long Id) {
        return empService.selecionarPorId(Id);
    }

}
