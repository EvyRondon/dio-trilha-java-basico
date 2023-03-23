package br.com.eve.collection.set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {

  @Override
  public int compare(Serie s1, Serie s2) {
    return s1.getGenero().compareTo(s2.getGenero());
  }

}
