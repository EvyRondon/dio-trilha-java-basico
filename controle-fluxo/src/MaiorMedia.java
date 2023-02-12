import java.util.Scanner;

public class MaiorMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero = 0, maior = 0, media, somaTotal = 0;
    int count = 1;
    final int total = 5;

    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();
      maior = numero > maior ? numero : maior;
      somaTotal += numero;
      count++;
    } while (count <= total);

    media = somaTotal / total;
    System.out.println("A média é: " + media);
    System.out.println("O maioar número é:" + maior);
  }
}
