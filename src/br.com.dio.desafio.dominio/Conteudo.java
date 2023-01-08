package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //Constants and Variables
    protected static final double XP_PADRAO = 10d;
    private String titulo, descricao;

    //Method XP calculation
    public abstract double calcularXp();

    //Geters and Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
