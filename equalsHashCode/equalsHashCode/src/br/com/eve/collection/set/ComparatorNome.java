package br.com.eve.collection.set;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Serie> {

  @Override
  public int compare(Serie s1, Serie s2) {
    return s1.getNome().compareTo(s2.getNome());
  }

}
