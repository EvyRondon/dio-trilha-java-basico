package EBOO;

public class Main {
  public static void main(String[] args) {
    System.out.println("-=- Orientação a objetos -=-");
    Carro carro = new Carro();

    carro.setCor("Prata");
    carro.setModelo("Etios");
    carro.setCapacidadeTanque(48);

    System.out.println(carro.getCor());
    System.out.println(carro.getModelo());
    double capacidade = carro.valorTotalEncherTanque(5.60);
    System.out.println("A capacidade do tanque " + capacidade);

    Carro carroCity = new Carro("Branca", "City", 50);
    System.out.println(carroCity.getCor());
    System.out.println(carroCity.getModelo());
    double capacidadeCity = carroCity.valorTotalEncherTanque(5.60);
    System.out.println("A capacidade do tanque " + capacidadeCity);

    Funcionario mariaOliveira = new Faxineiro();
    mariaOliveira.nome = "Maria";
    mariaOliveira.salario = 1500.00;

  }
}
