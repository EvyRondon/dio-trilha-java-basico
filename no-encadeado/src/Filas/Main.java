package Filas;

public class Main {
  public static void main(String[] args) {
    Fila<String> minhaFila = new Fila<>();
    minhaFila.enqueue("primeiro");
    minhaFila.enqueue("segundo");
    minhaFila.enqueue("terceiro");
    System.out.println(minhaFila);

    System.out.println(minhaFila.dequeue());

    System.out.println(minhaFila);
    minhaFila.enqueue("Evelym");
    System.out.println(minhaFila);
  }
}