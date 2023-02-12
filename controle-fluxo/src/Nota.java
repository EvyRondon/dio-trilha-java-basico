import java.util.Scanner;

public class Nota {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println("Nota: ");
    int nota = scan.nextInt();

    while (nota < 0 | nota > 10) {
      System.out.println("Valor inválido! Digite novamente");
      nota = scan.nextInt();
    }
  }
}