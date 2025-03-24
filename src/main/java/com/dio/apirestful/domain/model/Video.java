package com.dio.apirestful.domain.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_video")
public class Video {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String titulo;
    private String duracao;
    private String categoria;
    @ManyToOne
    @JoinColumn(name = "lista_de_reproducao_id")
    private ListaDeReproducao listaDeReproducao;

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ListaDeReproducao getListaDeReproducao() {
        return listaDeReproducao;
    }
    public void setListaDeReproducao(ListaDeReproducao listaDeReproducao) {
        this.listaDeReproducao = listaDeReproducao;
    }

    
}
