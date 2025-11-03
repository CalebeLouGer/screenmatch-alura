package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        var favorito = new Filme("Demon Slayer: Castelo Infinito",2025);
        favorito.avaliar(9);
        var outroFilme = new Filme("Quarteto Fantástico: Origem",2025);
        outroFilme.avaliar(6);
        var filmeBom = new Filme("Harry Potter e o Cálice de Fogo",2004);
        filmeBom.avaliar(10);
        var friends = new Serie("Friends",1990);

        List<Titulo> lista = new LinkedList<>();
        lista.add(favorito);
        lista.add(outroFilme);
        lista.add(filmeBom);
        lista.add(friends);


//        lista.forEach(titulos -> System.out.println(titulos));
//        lista.forEach(System.out::println);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("--- Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Guilherme Andrade");
        buscaPorArtista.add("João Manô");
        buscaPorArtista.add("Lucas Branco");
        buscaPorArtista.add("Calebe Lourenço");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista de Título Ordenados: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
