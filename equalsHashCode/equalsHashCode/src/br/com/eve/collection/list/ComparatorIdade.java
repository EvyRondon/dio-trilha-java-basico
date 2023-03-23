package br.com.eve.collection.list;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato gt1, Gato gt2) {
    return Integer.compare(gt1.getIdade(), gt2.getIdade());
  }

}
