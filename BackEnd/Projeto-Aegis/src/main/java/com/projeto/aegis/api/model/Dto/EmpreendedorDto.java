package com.projeto.aegis.api.model.Dto;

import com.projeto.aegis.api.Enums.Tipos_Acesso;

public class EmpreendedorDto {

    private String nome;
    private String endereco;
    private String telefone;
    private Tipos_Acesso tipoAcesso;
    private String nomeNegocio;
    private String tipoNegocio;
    private String acesso;
    private String senha;

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

    public void setNomeNegocio(String nomeNegocio) {
        this.nomeNegocio = nomeNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
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
