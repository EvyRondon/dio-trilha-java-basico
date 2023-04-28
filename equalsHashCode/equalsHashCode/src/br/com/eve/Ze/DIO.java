package br.com.eve.Ze;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class DIO {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int morangos = input.nextInt();
    int macas = input.nextInt();
    double valor = 0.0;

    if (morangos <= 5 && macas <= 5) {
      valor = ate5kg(morangos, macas);
    } else {
      valor = acimaDe5kg(morangos, macas);
    }

    if (valor >= 25.0 || (morangos + macas) >= 8)
      valor *= 0.9;

    System.out.println(valor);

    // TODO: Implemente as condições necessárias para retornar o preço a ser pago
    // pelo cliente, conforme a tabela de preços do seu Zé:

  }

  private static double acimaDe5kg(int morangos, int macas) {
    double valor;
    valor = morangos * 2.2;
    valor += macas * 1.5;
    return valor;
  }

  private static double ate5kg(int morangos, int macas) {
    double valor;
    valor = morangos * 2.5;
    valor += macas * 1.8;
    return valor;
  }
}
