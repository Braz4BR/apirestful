package com.dio.apirestful.domain.model;

import java.sql.Date;

public class Assinatura {
    private String plano;
    private Float preco;
    private Date validade;
    
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
    public Float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    
}
