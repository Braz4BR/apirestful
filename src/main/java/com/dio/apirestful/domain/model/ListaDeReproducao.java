package com.dio.apirestful.domain.model;

import java.util.List;

public class ListaDeReproducao {
    
    private String nome;
    private List<Video> video;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Video> getVideo() {
        return video;
    }
    public void setVideo(List<Video> video) {
        this.video = video;
    }

}
