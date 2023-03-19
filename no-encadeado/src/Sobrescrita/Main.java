package Sobrescrita;

public class Main {
  public static void main(String[] args) {
    ClasseMae[] classes = new ClasseMae[] { new ClasseFilhaA(), new ClasseFilhaB(), new ClasseMae() };

    for (ClasseMae classe : classes) {
      classe.metodo1();
    }

    System.out.println("----");

    for (ClasseMae classe : classes) {
      classe.metodo2();
    }

    System.out.println("----");
    ClasseFilhaB classeFilhaB = new ClasseFilhaB();
    classeFilhaB.metodo2();
  }
}
