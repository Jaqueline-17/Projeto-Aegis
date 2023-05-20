package com.projeto.aegis.api.model.Entity;

import com.projeto.aegis.api.Enums.Tipo_Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduto;
   
    private Long idFornecedor;
    private Double valorUnitario;
    private Integer quantidade;
    private Double valorTotal;
    private Tipo_Produto tipoProduto;
    private String descricao;



    public Estoque() {
    }

    public Estoque(Long idProduto, Long idFornecedor, Double valorUnitario, Integer quantidade, Double valorTotal,
            Tipo_Produto tipoProduto, String descricao) {
        this.idProduto = idProduto;
        this.idFornecedor = idFornecedor;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.tipoProduto = tipoProduto;
        this.descricao = descricao;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

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
