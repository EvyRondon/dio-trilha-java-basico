package desafios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Objects;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String AN1, AN2, AN3;
    AN1 = sc.nextLine();
    AN2 = sc.nextLine();
    AN3 = sc.nextLine();

    Map<Animal, String> animais = new HashMap<Animal, String>() {
      {
        put(new Animal("vertebrado", "ave", "carnivoro"), "aguia");
        put(new Animal("vertebrado", "ave", "onivoro"), "pomba");
        put(new Animal("vertebrado", "mamifero", "onivoro"), "homem");
        put(new Animal("vertebrado", "mamifero", "herbivoro"), "vaca");
        put(new Animal("invertebrado", "inseto", "hematofago"), "pulga");
        put(new Animal("invertebrado", "inseto", "herbivoro"), "lagarta");
        put(new Animal("invertebrado", "anelideo", "hematofago"), "sanguessuga");
        put(new Animal("invertebrado", "anelideo", "onivoro"), "minhoca");
      }
    };

    System.out.println(animais.get(new Animal(AN1, AN2, AN3)));
  }

}

class Animal {
  String Reino;
  String Classe;
  String Tipo;
  private int hashCode;

  public Animal(String reino, String classe, String tipo) {
    Reino = reino;
    Classe = classe;
    Tipo = tipo;
    this.hashCode = Objects.hash(Reino, Classe, Tipo);
  }

  public String getReino() {
    return Reino;
  }

  public String getClasse() {
    return Classe;
  }

  public String getTipo() {
    return Tipo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    final Animal other = (Animal) obj;
    return this.Classe.equals(other.Classe) &&
        this.Reino.equals(other.Reino) &&
        this.Tipo.equals(other.Tipo);
  }

  @Override
  public int hashCode() {
    return this.hashCode;
  }
}
