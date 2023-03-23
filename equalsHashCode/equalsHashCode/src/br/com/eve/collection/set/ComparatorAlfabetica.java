package br.com.eve.collection.set;

import java.util.Comparator;

public class ComparatorAlfabetica implements Comparator<String> {

  @Override
  public int compare(String tp1, String tp2) {
    return tp1.compareTo(tp2);
  }

}
