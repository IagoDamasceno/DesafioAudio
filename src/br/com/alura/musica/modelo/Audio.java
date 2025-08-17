package br.com.alura.musica.modelo;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    //Métodos

    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducao++;
    }

    public void avaliar(int nota){
        if(nota>=1 && nota<=5){
            classificacao = (classificacao+nota)/2;
        }
    }

    public void exibirInformarcoes(){
        System.out.println("Reproduzindo" + titulo);
        System.out.println("Tempo de duração: " + duracao);
        System.out.println("Total de curtidas: " + totalCurtidas);
        System.out.println("Vão ser reproduzidas: " + totalReproducao);
    }


}
