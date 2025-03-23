package com.dio.apirestful.domain.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String Assinatura;
    private List <ListaDeReproducao> listas;
    private List<Notificacao> notificacoes;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAssinatura() {
        return Assinatura;
    }
    public void setAssinatura(String assinatura) {
        Assinatura = assinatura;
    }
    public List<ListaDeReproducao> getListas() {
        return listas;
    }
    public void setListas(List<ListaDeReproducao> listas) {
        this.listas = listas;
    }
    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }
    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    
}
