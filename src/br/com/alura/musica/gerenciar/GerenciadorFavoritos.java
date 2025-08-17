package br.com.alura.musica.gerenciar;

import br.com.alura.musica.modelo.Audio;

public class GerenciadorFavoritos {

    public void adicionar(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é um dos favoritos! ");
        } else {
            System.out.println(audio.getTitulo() + " não entrou nos favoritos.");
        }
    }
}
