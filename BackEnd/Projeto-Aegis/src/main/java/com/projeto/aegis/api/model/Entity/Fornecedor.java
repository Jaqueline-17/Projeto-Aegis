package com.projeto.aegis.api.model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Long idFornecedor;

    @Column(name = "nome_dominio")
    private String nomeDominio;
    private String tipoNegocio;
    private String telefone;
    private String endereco;
    @Column(name = "nome_contato")
    private String emailContato;

    public Fornecedor() {
    }

    public Fornecedor(Long idFornecedor, String nomeDominio, String tipoNegocio, String telefone, String endereco,
            String emailContato) {
        this.idFornecedor = idFornecedor;
        this.nomeDominio = nomeDominio;
        this.tipoNegocio = tipoNegocio;
        this.telefone = telefone;
        this.endereco = endereco;
        this.emailContato = emailContato;
    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeDominio() {
        return nomeDominio;
    }

    public void setNomeDominio(String nomeDominio) {
        this.nomeDominio = nomeDominio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

}
