package br.com.alura.Musicas.Gerenciar;
import br.com.alura.Musicas.modelos.Audio;

class GerenciadorFavoritos {
    public void adicionar(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            // regra: se a nota for alta, é favorito
            System.out.println(audio.getTitulo() + " é um dos favoritos! ");
        } else {
            System.out.println(audio.getTitulo() + " não entrou nos favoritos.");
        }
    }
}