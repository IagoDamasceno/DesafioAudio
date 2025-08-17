package br.com.alura.musica.modelo;

public class Podcast extends Audio {

    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirInformarcoes() {
        System.out.println("Reproduzindo " + getTitulo() + " do apresentador " + apresentador);
        System.out.println("Tempo de duração: " + getDuracao());
        System.out.println("Total de curtidas: " + getTotalCurtidas());
        System.out.println("Total de reproduções: " + getTotalReproducao());
    }
}
