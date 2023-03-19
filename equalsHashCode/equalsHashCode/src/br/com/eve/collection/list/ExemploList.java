package br.com.eve.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
  public static void main(String[] args) {
    System.out.println("------------------------------------");
    System.out.println("Crie uma lista e adicione as 7 notas");
    List<Double> notes = new ArrayList<>();
    notes.add(7d);
    notes.add(8.5);
    notes.add(9.3);
    notes.add(5d);
    notes.add(5.9);
    notes.add(7.9);
    notes.add(0d);
    notes.add(3.6);
    System.out.println(notes);

    System.out.println("Exiba a posição da nota 5.0: " + notes.indexOf(5d));
    System.out.println("Adicione na lista a nota 8 na posição 4: ");
    notes.add(4, 8d);
    System.out.println(notes.toString());
    System.out.println("Substitua a nota 5 pela nota 6");
    notes.set(notes.indexOf(5d), 6d);
    System.out.println(notes.toString());
    System.out.println("Confira se a nota 5 está na lista: " + notes.contains(5d));
    System.out.println("Exiba todas as notas na ordem em que foram informadas:");
    for (Double nota : notes)
      System.out.println(nota);

    System.out.println("Exiba a terceira nota adicionada: " + notes.get(2));
    System.out.println(notes.toString());

    System.out.println("Exiba a menos nota " + Collections.min(notes));
    System.out.println("Exiba a maior nota " + Collections.max(notes));

    Iterator<Double> iterator = notes.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println("Exiba a média das notas: " + (soma / notes.size()));
    System.out.println("remova a nota 0: ");
    notes.remove(notes.indexOf(0d));
    System.out.println(notes);

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator1 = notes.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println(notes);

    System.out.println("Confira se a lista está vazia: " + notes.isEmpty());
    System.out.println("Apague toda a lista");
    notes.clear();
    System.out.println(notes);
    System.out.println("Confira se a lista está vazia: " + notes.isEmpty());
  }
}