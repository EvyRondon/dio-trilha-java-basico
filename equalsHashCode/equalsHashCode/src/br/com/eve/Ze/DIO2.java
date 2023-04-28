package br.com.eve.Ze;

import java.io.IOException;
import java.util.Scanner;

public class DIO2 {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto = 0.0;

    if (renda <= 2000.0) {
      System.out.println("Isento");
    } else {
      pagaImposto(renda, imposto);
    }
    // TODO: Agora utilizando estrutura condicional implemente em seu código as
    // condições necessárias para o cálculo da taxa de imposto de renda:

  }

  private static void pagaImposto(double renda, double imposto) {
    if (renda <= 3000.0) {
      imposto = (renda - 2000.0) * 0.08;
    } else if (renda >= 3000.01 && renda <= 4500.00) {
      imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
    } else if (renda > 4500.0) {
      imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
    }
    System.out.printf("R$ %.2f\n", imposto);
  }
}
