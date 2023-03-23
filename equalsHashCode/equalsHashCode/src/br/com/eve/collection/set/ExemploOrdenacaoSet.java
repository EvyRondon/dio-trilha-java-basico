package br.com.eve.collection.set;
/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenacaoSet {
  public static void main(String[] args) {
    System.out.println("--\tOrdem aleatória\t--");
    Set<Serie> minhasSeries = new HashSet<Serie>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("70s show", "comédia", 25));
      }
    };
    for (Serie serie : minhasSeries)
      System.out.println(serie.getNome() + " - " +
          serie.getGenero() + " - " +
          serie.getTempoEpisodio());
    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> minhasSeries2 = new LinkedHashSet<Serie>() {
      {
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("70s show", "comédia", 25));
      }
    };
    for (Serie serie : minhasSeries2)
      System.out.println(serie.getNome() + " - " +
          serie.getGenero() + " - " +
          serie.getTempoEpisodio());

    System.out.println("--\tOrdem natural (Tempo episodio)\t--");
    Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
    for (Serie serie3 : minhasSeries3)
      System.out.println(serie3.getNome() + " - " + serie3.getGenero() + " - " + serie3.getTempoEpisodio());

    System.out.println("--\tOrdem natural Nome/Genero/TempoEpisotido\t--");
    Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
    minhasSeries4.addAll(minhasSeries);
    for (Serie serie4 : minhasSeries4)
      System.out.println(serie4.getNome() + " - " + serie4.getGenero() + " - " + serie4.getTempoEpisodio());
    System.out.println("--\tOrdem natural Nome\t--");
    Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorNome());
    minhasSeries5.addAll(minhasSeries);
    for (Serie serie4 : minhasSeries5)
      System.out.println(serie4.getNome() + " - " + serie4.getGenero() + " - " + serie4.getTempoEpisodio());
    System.out.println("--\tOrdem natural Genero\t--");
    Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorGenero());
    minhasSeries6.addAll(minhasSeries);
    for (Serie serie4 : minhasSeries6)
      System.out.println(serie4.getNome() + " - " + serie4.getGenero() + " - " + serie4.getTempoEpisodio());
  }
}
