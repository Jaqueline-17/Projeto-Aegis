package com.projeto.aegis.api.model.Dto;

import java.time.LocalDate;

import com.projeto.aegis.api.Enums.Status_Contas;

public class ContasDto {

    private String credor;
    private Double valor;
    private LocalDate dataEmmissao;
    private LocalDate dataVencimento;
    private String descricao;
    private Status_Contas status;

   
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
