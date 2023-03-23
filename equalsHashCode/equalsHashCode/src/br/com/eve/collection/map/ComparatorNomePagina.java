package br.com.eve.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNomePagina implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
    Integer porNome = l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    if (porNome != 0)
      return porNome;
    return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
  }

}
