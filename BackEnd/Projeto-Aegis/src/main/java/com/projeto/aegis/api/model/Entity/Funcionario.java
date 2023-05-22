package com.projeto.aegis.api.model.Entity;

import com.projeto.aegis.api.Enums.Tipos_Acesso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long idFuncionario;

    private String nome;
    private String telefone;
    private String cargo;
    @Column(name = "tipo_acesso")
    private Tipos_Acesso tipoAcesso;
    private String acesso;
    private String senha;

    public Funcionario() {

    }

    public Funcionario(Long idFuncionario, String nome, String telefone, String cargo, Tipos_Acesso tipoAcesso,
            String acesso, String senha) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.telefone = telefone;
        this.cargo = cargo;
        this.tipoAcesso = tipoAcesso;
        this.acesso = acesso;
        this.senha = senha;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

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
