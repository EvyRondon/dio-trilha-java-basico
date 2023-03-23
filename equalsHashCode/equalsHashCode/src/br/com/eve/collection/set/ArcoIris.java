package br.com.eve.collection.set;

import java.util.*;

public class ArcoIris {
  public static void main(String[] args) {
    Set<String> cores = new HashSet<String>() {
      {
        add(new String("Vermelho"));
        add(new String("Azul"));
        add(new String("Amarelo"));
        add(new String("Verde"));
        add(new String("Lilas"));
        add(new String("Laranja"));
      }
    };
    System.out.println("Exibe todas as cores uma abaixo da outra:");
    for (String cor : cores)
      System.out.println(cor);
    System.out.println("A quantidade de cores o arcoires tem: " + cores.size());
    System.out.println("Exibir em ordem alfabetica");
    Set<String> cores1 = new TreeSet<>(cores);
    System.out.println(cores1);

    System.out.println("Exiba as cores na ordem inversa da que foi informada ");
    Set<String> coresArcoIris3 = new LinkedHashSet<>(
        Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
    System.out.println(coresArcoIris3);
    List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
    Collections.reverse(coresArcoIrisList);
    System.out.println(coresArcoIrisList);

    System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
    for (String cor : coresArcoIris3) {
      if (cor.startsWith("v"))
        System.out.println(cor);
    }
    System.out.println("Remova todas as cores que não começam com a letra “v”: ");
    Iterator<String> iterator2 = coresArcoIris3.iterator();
    while (iterator2.hasNext()) {
      if (!iterator2.next().startsWith("v"))
        iterator2.remove();
    }
    System.out.println(coresArcoIris3);
    System.out.println("Limpe o conjunto: ");
    coresArcoIris3.clear();

    System.out.println("Confira se o conj. esta vazio " + coresArcoIris3.isEmpty());
  }
}