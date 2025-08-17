package br.com.alura.musica.principal;

import br.com.alura.musica.gerenciar.GerenciadorFavoritos;
import br.com.alura.musica.modelo.Musica;
import br.com.alura.musica.modelo.Podcast;

public class Main {
    public static void main(String[] args) {

        // Criando músicas
        Musica musica1 = new Musica();
        musica1.setTitulo("On The Nature of Daylight");
        musica1.setArtista("Max Richter");
        musica1.setGenero("Clássica");
        musica1.setDuracao(6);
        musica1.curtir();
        musica1.reproduzir();
        musica1.avaliar(9);

        Musica musica2 = new Musica();
        musica2.setTitulo("Bohemian Rhapsody");
        musica2.setArtista("Queen");
        musica2.setGenero("Rock");
        musica2.setDuracao(6);
        musica2.curtir();
        musica2.curtir();
        musica2.reproduzir();
        musica2.reproduzir();
        musica2.avaliar(10);

        Musica musica3 = new Musica();
        musica3.setTitulo("Blinding Lights");
        musica3.setArtista("The Weeknd");
        musica3.setGenero("Pop");
        musica3.setDuracao(4);
        musica3.reproduzir();
        musica3.curtir();
        musica3.avaliar(7);

        // Criando podcasts
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("DevCast");
        podcast1.setApresentador("Jacqueline Oliveira");
        podcast1.setDescricao("Tecnologia e tendências no mundo da programação.");
        podcast1.setDuracao(60);
        podcast1.curtir();
        podcast1.reproduzir();
        podcast1.avaliar(8);

        Podcast podcast2 = new Podcast();
        podcast2.setTitulo("História em Minutos");
        podcast2.setApresentador("Carlos Mendes");
        podcast2.setDescricao("Episódios rápidos sobre momentos marcantes da história.");
        podcast2.setDuracao(30);
        podcast2.curtir();
        podcast2.curtir();
        podcast2.reproduzir();
        podcast2.reproduzir();
        podcast2.avaliar(9);

        Podcast podcast3 = new Podcast();
        podcast3.setTitulo("Café com Dados");
        podcast3.setApresentador("Marina Silva");
        podcast3.setDescricao("Discussões sobre ciência de dados e inteligência artificial.");
        podcast3.setDuracao(45);
        podcast3.reproduzir();
        podcast3.avaliar(6);

        // Gerenciador de favoritos
        GerenciadorFavoritos favoritos = new GerenciadorFavoritos();

        System.out.println("==== Testando favoritos ====");
        favoritos.adicionar(musica1);
        favoritos.adicionar(musica2);
        favoritos.adicionar(musica3);
        favoritos.adicionar(podcast1);
        favoritos.adicionar(podcast2);
        favoritos.adicionar(podcast3);

        System.out.println("\n==== Exibindo informações ====");
        musica1.exibirInformarcoes();
        musica2.exibirInformarcoes();
        musica3.exibirInformarcoes();
        podcast1.exibirInformarcoes();
        podcast2.exibirInformarcoes();
        podcast3.exibirInformarcoes();
    }
}
