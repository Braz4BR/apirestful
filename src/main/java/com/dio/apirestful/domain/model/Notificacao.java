package com.dio.apirestful.domain.model;

import java.sql.Date;

public class Notificacao {
    private String tipo;
    private String mensagem;
    private Date data;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    
    
}
