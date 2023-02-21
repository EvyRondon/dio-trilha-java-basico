import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int vezes, count = 0, numero = 0, qtdPar = 0, qtdImpar = 0;

    System.out.println("Quantas vezes vai informar o número?");
    vezes = scan.nextInt();

    do {
      System.out.println("Digite o valor: ");
      numero = scan.nextInt();
      if (numero % 2 == 0)
        qtdPar++;
      else
        qtdImpar++;
      count++;
    } while (count < vezes);
    System.out.println("Quantidade de números pares:" + qtdPar);
    System.out.println("Quanditade de números impares:" + qtdImpar);
  }
}
