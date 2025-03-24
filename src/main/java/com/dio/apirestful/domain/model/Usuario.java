package com.dio.apirestful.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(name = "userEmail",length = 200, unique = true)
    private String userEmail;

    // Assinatura como um relacionamento OneToOne
    @OneToOne(cascade = CascadeType.ALL)
    private Assinatura tipoAssinatura;

    // Relacionamento OneToMany para as listas de reprodução
    @OneToMany(cascade = CascadeType.ALL)
    private List<ListaDeReproducao> listas;

    // Relacionamento OneToMany para as notificações
    @OneToMany(cascade = CascadeType.ALL)
    private List<Notificacao> notificacoes;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    // Getter e Setter para tipoAssinatura
    public Assinatura getTipoAssinatura() {
        return tipoAssinatura;
    }

    public void setTipoAssinatura(Assinatura tipoAssinatura) {
        this.tipoAssinatura = tipoAssinatura;  // Correção: agora está atribuindo corretamente
    }

    // Getter e Setter para listas
    public List<ListaDeReproducao> getListas() {
        return listas;
    }

    public void setListas(List<ListaDeReproducao> listas) {
        this.listas = listas;
    }

    // Getter e Setter para notificações
    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

}
