package com.projeto.aegis.api.model.Dto;

import com.projeto.aegis.api.Enums.Tipo_Produto;

public class EstoqueDto {

    private Long idFornecedor;
    private Double valorUnitario;
    private Integer quantidade;
    private Double valorTotal;
    private Tipo_Produto tipoProduto;
    private String descricao;


    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Tipo_Produto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Tipo_Produto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
