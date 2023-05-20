package com.projeto.aegis.api.model.Entity;

import com.projeto.aegis.api.Enums.Tipos_Acesso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empreendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empreendedor")
    private Long idEmpreendedor;

    private String nome;
    private String endereco;
    private String telefone;
    private Tipos_Acesso tipoAcesso;
    private String nomeNegocio;
    private String tipoNegocio;
    private String acesso;
    private String senha;

    public Empreendedor() {

    }

    public Empreendedor(Long idEmpreendedor, String nome, String endereco, String telefone, Tipos_Acesso tipoAcesso,
            String nome_negocio, String tipo_negocio, String acesso, String senha) {
        this.idEmpreendedor = idEmpreendedor;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoAcesso = tipoAcesso;
        this.nomeNegocio = nome_negocio;
        this.tipoNegocio = tipo_negocio;
        this.acesso = acesso;
        this.senha = senha;
    }

    public Long getIdEmpreendedor() {
        return idEmpreendedor;
    }

    public void setIdEmpreendedor(Long idEmpreendedor) {
        this.idEmpreendedor = idEmpreendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Tipos_Acesso getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(Tipos_Acesso tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public String getNomeNegocio() {
        return nomeNegocio;
    }

    public void setNomeNegocio(String nome_negocio) {
        this.nomeNegocio = nome_negocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipo_negocio) {
        this.tipoNegocio = tipo_negocio;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
