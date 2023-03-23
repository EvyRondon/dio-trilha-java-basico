package br.com.eve.collection.list;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato gt1, Gato gt2) {
    int porNome = gt1.getNome().compareToIgnoreCase(gt2.getNome());
    if (porNome != 0)
      return porNome;

    int pelaCor = gt1.getCor().compareToIgnoreCase(gt2.getCor());
    if (pelaCor != 0)
      return pelaCor;

    return Integer.compare(gt1.getIdade(), gt2.getIdade());
  }

}
