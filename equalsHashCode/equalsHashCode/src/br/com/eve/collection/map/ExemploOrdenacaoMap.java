package br.com.eve.collection.map;

import java.util.*;

public class ExemploOrdenacaoMap {
  public static void main(String[] args) {
    System.out.println("--\tOrdem aleatória\t--");
    Map<String, Livro> meusLivros = new HashMap<String, Livro>() {
      {
        put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 288));
        put("Duhigg, Charles", new Livro("O poder do habito", 408));
        put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
      }
    };
    for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    System.out.println("--\tOrdem inserção\t--");
    Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>() {
      {
        put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 288));
        put("Duhigg, Charles", new Livro("O poder do habito", 408));
        put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
      }
    };
    for (Map.Entry<String, Livro> livro2 : meusLivros1.entrySet())
      System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());

    System.out.println("--\tOrdem alfabética autores\t--");
    Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(meusLivros1);
    for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet())
      System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());

    System.out.println("--\tOrdem alfabética nome dos livros\t--");
    Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<Map.Entry<String, Livro>>(new ComparatorNome());
    meusLivros3.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> livro : meusLivros3)
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    System.out.println("--\tOrdem alfabética nome e pág. dos livros\t--");
    Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<Map.Entry<String, Livro>>(new ComparatorNomePagina());
    meusLivros4.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> livro : meusLivros4)
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
  }
}
