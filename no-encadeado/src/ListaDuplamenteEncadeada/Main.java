package ListaDuplamenteEncadeada;

public class Main {
  public static void main(String[] args) {
    ListaDuplamenteEncadeada<String> minhaListaDpEncadeada = new ListaDuplamenteEncadeada<String>();
    minhaListaDpEncadeada.add("E1");
    minhaListaDpEncadeada.add("E2");
    minhaListaDpEncadeada.add("E3");
    minhaListaDpEncadeada.add("E4");
    minhaListaDpEncadeada.add("E5");
    minhaListaDpEncadeada.add("E6");
    minhaListaDpEncadeada.add("E7");

    System.out.println(minhaListaDpEncadeada);

    minhaListaDpEncadeada.remove(3);
    minhaListaDpEncadeada.add("99", 3);
    System.out.println(minhaListaDpEncadeada);
  }
}
