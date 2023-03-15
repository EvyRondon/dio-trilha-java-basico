package Sobrecarga;

public class Main {
  public static void main(String[] args) {
    System.out.println("Exercicio quadrilatero");
    System.out.println("Área do quadrado: " + Quadrilatero.area(3));
    System.out.println("Área do retângulo: " + Quadrilatero.area(5d, 5d));
    System.out.println("Área do trapézio: " + Quadrilatero.area(7, 8, 9));
    System.out.println("Área do losango: " + Quadrilatero.area(5f, 5f));
  }
}
