package br.com.eve.collection.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "5", "6");
    // System.out.println("Imprima todos os elementos dessa lista de Strings");
    // numerosAleatorios.forEach(System.out::println);

    // System.out.println("Pegue os 5 primeiros núm. e coloque dentro de um Set:");
    // Set<String> setToSet= numerosAleatorios.stream()
    // .limit(5)
    // .collect(Collectors.toSet());

    // System.out.println("Transforme esta lista de strings em uma lista de númeors
    // inteiros");
    // List<Integer> numAleatorios = numerosAleatorios.stream()
    // .map(Integer::parseInt)
    // .collect(Collectors.toList());

    // numAleatorios
    // .forEach(System.out::println);

    // System.out.println("Pegue os núm pares maiores q 2 e coloque em uma lista");
    List<Integer> listParesMaior2 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0 && i > 2)
        .collect(Collectors.toList());
    // System.out.println(listParesMaior2);

    // System.out.println("Mostre a média dos números");
    // numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
    System.out.println("Remova os numeros impares");
    List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    numerosAleatorios1.removeIf(t -> t % 2 != 0);
    System.out.println(numerosAleatorios1);
  }
}
