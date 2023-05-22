package com.projeto.aegis.api.model.Entity;

import java.time.LocalDate;

import com.projeto.aegis.api.Enums.Status_Contas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Contas {

    private String credor;
    private Double valor;
    @Column(name = "data_emissão")
    private LocalDate dataEmmissao;
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;
    private String descricao;
    private Status_Contas status;

    public Contas() {
    }

    public Contas(String credor, Double valor, LocalDate dataEmmissao, LocalDate dataVencimento, String descricao,
            Status_Contas status) {
        this.credor = credor;
        this.valor = valor;
        this.dataEmmissao = dataEmmissao;
        this.dataVencimento = dataVencimento;
        this.descricao = descricao;
        this.status = status;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataEmmissao() {
        return dataEmmissao;
    }

    public void setDataEmmissao(LocalDate dataEmmissao) {
        this.dataEmmissao = dataEmmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status_Contas getStatus() {
        return status;
    }

    public void setStatus(Status_Contas status) {
        this.status = status;
    }

}
