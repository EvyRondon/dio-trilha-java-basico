/**
 * @author evelym
 * @version 1.0
 * @since 09/02/2023
 */
public class Calculadora implements OperacaoMatematica {
  /**
   * Este método é utilizado para somar dois números inteiros
   * 
   * @param numeroUm   este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return double o resultado deste método é a soma dos dois números.
   */
  public double somar(double numeroUm, double numeroDois) {
    return numeroUm + numeroDois;
  }

  /**
   * @param numeroUm este é o segundo parâmetro do mét
   * @param numDois  este é o segundo parâmetro do mét
   * @return double
   */
  public double subtrair(double numeroUm, double numeroDois) {
    return numeroUm - numeroDois;
  }

  public double dividir(double numeroUm, double numeroDois) {
    return numeroUm / numeroDois;
  }

  public double multiplicar(double numeroUm, double numeroDois) {
    return numeroUm * numeroDois;
  }
}
