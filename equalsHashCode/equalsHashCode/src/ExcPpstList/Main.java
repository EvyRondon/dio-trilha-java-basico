package ExcPpstList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Double> temperaturas = new ArrayList<Double>();

    pegaTemperatura(temperaturas);

    System.out.println("Todas as Temperaturas");
    temperaturas.forEach(t -> System.out.print(t + " "));

    Double media = mediaTemperatura(temperaturas);

    // exibe o mes das temperaturas acima da media por extenso
    System.out.println("\n\nMeses das temperaturas acima da média: ");
    Iterator<Double> iterator = temperaturas.iterator();

    Integer count = 0;
    while (iterator.hasNext()) {
      double temp = iterator.next();
      if (temp > media) {
        switch (count) {
          case (0):
            System.out.printf("1 - janeiro: %.1f\n", temp);
            break;
          case (1):
            System.out.printf("2 - fevereiro: %.1f\n", temp);
            break;
          case (2):
            System.out.printf("3 - marco: %.1f\n", temp);
            break;
          case (3):
            System.out.printf("4 - abril: %.1f\n", temp);
            break;
          case (4):
            System.out.printf("5 - maio: %.1f\n", temp);
            break;
          case (5):
            System.out.printf("6 - junho: %.1f\n", temp);
            break;
          default:
            System.out.println("não houve temp acima da média");
        }
      }
      count++;
    }

  }

  private static Double mediaTemperatura(List<Double> temperaturas) {
    // calculando e exibindo a média das temperaturas
    double media = temperaturas.stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0d);
    System.out.printf("\n Média das temperaturas: %.1f\n", media);
    return media;
  }

  private static void pegaTemperatura(List<Double> temperaturas) {
    try (Scanner scan = new Scanner(System.in)) {
      // Incluindo as temepraturas na lista
      int count = 0;
      while (true) {
        if (count == 6)
          break;

        System.out.println("Digite a temperatura: ");
        Double temp = scan.nextDouble();
        temperaturas.add(temp);
        count++;
      }
    }
  }
}
