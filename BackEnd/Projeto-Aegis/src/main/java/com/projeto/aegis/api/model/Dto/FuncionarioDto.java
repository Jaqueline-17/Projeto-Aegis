package com.projeto.aegis.api.model.Dto;

import com.projeto.aegis.api.Enums.Tipos_Acesso;

public class FuncionarioDto {

    private String nome;
    private String telefone;
    private String cargo;
    private Tipos_Acesso tipoAcesso;
    private String acesso;
    private String senha;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Tipos_Acesso getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(Tipos_Acesso tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
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
