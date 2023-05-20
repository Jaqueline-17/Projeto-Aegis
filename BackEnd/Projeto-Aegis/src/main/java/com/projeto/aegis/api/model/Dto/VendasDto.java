package com.projeto.aegis.api.model.Dto;

import java.time.LocalDate;

import com.projeto.aegis.api.Enums.Forma_Pagamento;
import com.projeto.aegis.api.Enums.Status_Pagamento;

public class VendasDto {

    private Long idCliente;
    private Long idProduto;
    private LocalDate dataHora;
    private Forma_Pagamento formaPagamento;
    private Status_Pagamento status;

    
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
