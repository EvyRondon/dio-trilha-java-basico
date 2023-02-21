import java.io.IOException;
import java.util.Scanner;

public class DIO {
  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    try (Scanner leitor = new Scanner(System.in)) {
      int cont = 0;
      double media = 0, valorDigitado = 0, total = 0;

      // TODO: Implemente as condições adequadas para obter a quantidade
      // de valores positivos e a média dos valores positivos:
      for (int i = 0; i < 6; i++) {
        valorDigitado = Double.parseDouble(leitor.next());
        if (valorDigitado > 0) {
          total += valorDigitado;
          cont++;
        }
      }

      media = total / cont;
      System.out.println(cont + " valores positivos");
      System.out.println(String.format("%.1f", media));
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
