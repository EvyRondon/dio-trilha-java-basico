package br.com.eve.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
  /**
   * @param args
   */
  public static void main(String[] args) {
    List<Gato> myCats = new ArrayList<Gato>() {
      {
        add(new Gato("Jon", 18, "black"));
        add(new Gato("Simba", 6, "Tigrado"));
        add(new Gato("Mimi", 12, "yellow"));
      }
    };
    System.out.println("--\tOrdem de Inserção\t--");
    System.out.println(myCats);
    System.out.println("--\tOrdem de aleatória\t--");
    Collections.shuffle(myCats);
    System.out.println(myCats);
    System.out.println("--\tOrdem de Natural (Nomes)\t--");
    Collections.sort(myCats);
    System.out.println(myCats);

    System.out.println("--\tOrdem Idades)\t--");
    Collections.sort(myCats, new ComparatorIdade());
    // myCats.sort(new ComparatorIdade());
    System.out.println(myCats);

    System.out.println("--\tOrdem Cor\t--");
    // Collections.sort(myCats, new ComparatorCor());
    myCats.sort(new ComparatorCor());
    System.out.println(myCats);

    System.out.println("--\tOrdem Nome Idade Cor\t--");
    // Collections.sort(myCats, new ComparatorCor());
    myCats.sort(new ComparatorNomeCorIdade());
    System.out.println(myCats);
  }
}