package br.com.eve.Ze;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] strSplit = str.split(" ");
    char[] arrVogais = { 'a', 'e', 'i', 'o', 'u' };
    int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

    for (String item : strSplit) {
      for (char vogal : arrVogais) {
        for (char letra : item.toLowerCase().toCharArray()) {
          if (vogal == letra) {
            quantVogais++;
          }
        }
      }
      // TODO: Implemente condições (laços) adequados para que possamos contar os
      // espaços em brancos e as vogais que existem na string.
      // Dica: Você pode utilizar o Character.toLowerCase em sua condição:

    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
  }
}
