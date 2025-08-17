package br.com.alura.musica.modelo;

public class Musica extends Audio{
    private String artista;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirInformarcoes(){
        System.out.println("Reproduzindo" + getTitulo() + " do artista " + artista + " do gênero: " + genero);
        System.out.println("Tempo de duração: " + getDuracao());
        System.out.println("Total de curtidas: " + getTotalCurtidas());
        System.out.println("Vão ser reproduzidas: " + getTotalReproducao());

    }
}
