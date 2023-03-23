package SetExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
  public static void main(String[] args) {
    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas.toString());

    System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    Iterator<Double> it = notas.iterator();
    Double soma = 0d;
    while (it.hasNext()) {
      Double next = it.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores " + soma);
    System.out.println("Exiba a média das notas: " + soma / notas.size());
    System.out.println("Remova a nota zero: ");
    notas.remove(0d);
    System.out.println(notas);
    System.out.println("Remova as notas menores que 7 e exiba a lista:");
    Iterator<Double> it2 = notas.iterator();
    while (it2.hasNext()) {
      Double next = it2.next();
      if (next < 7) {
        it2.remove();
      }
    }
    System.out.println(notas);

    System.out.println("Exiba todas as notas na ordem que foram informadas");
    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(5d);
    notas2.add(7d);
    notas2.add(0d);
    notas2.add(3.6);
    System.out.println(notas2);
    System.out.println("Exiba todas as notas na ordem crescente");
    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);
    System.out.println("Apague todo o conjunto");
    notas.clear();
    System.out.println("verifique se está vazio o conjunto: " + notas.isEmpty());
  }
}
