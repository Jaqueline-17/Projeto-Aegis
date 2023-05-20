package com.projeto.aegis.api.model.Entity;

import java.time.LocalDate;

import com.projeto.aegis.api.Enums.Forma_Pagamento;
import com.projeto.aegis.api.Enums.Status_Pagamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVenda;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "data_hora")
    private LocalDate dataHora;

    @Column(name = "forma_pagamento")
    private Forma_Pagamento formaPagamento;
    private Status_Pagamento status;


    
    public Vendas() {
    }

    public Vendas(Long idVenda, Long idCliente, Long idProduto, LocalDate dataHora, Forma_Pagamento formaPagamento,
            Status_Pagamento status) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.dataHora = dataHora;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Forma_Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Forma_Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Status_Pagamento getStatus() {
        return status;
    }

    public void setStatus(Status_Pagamento status) {
        this.status = status;
    }

}
