package br.com.eve.collection.set;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Carro> hashSetCarros = new HashSet<Carro>() {
      {
        add(new Carro("Ford"));
        add(new Carro("Chevrolet"));
        add(new Carro("Fiat"));
        add(new Carro("Peugeot"));
        add(new Carro("Zip"));
        add(new Carro("Alfa Romeio"));
      }
    };
    System.out.println(hashSetCarros);

    Set<Carro> treeSetCarros = new TreeSet<Carro>() {
      {
        add(new Carro("Ford"));
        add(new Carro("Chevrolet"));
        add(new Carro("Fiat"));
        add(new Carro("Peugeot"));
        add(new Carro("Zip"));
        add(new Carro("Alfa Romeio"));
      }
    };
    System.out.println(treeSetCarros);
  }
}
