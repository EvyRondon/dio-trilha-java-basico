package br.com.eve.collection.list;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {

  @Override
  public int compare(Gato gt1, Gato gt2) {
    return gt1.getCor().compareToIgnoreCase(gt2.getCor());
  }
}
