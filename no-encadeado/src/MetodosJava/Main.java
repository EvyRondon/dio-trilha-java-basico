package MetodosJava;

public class Main {
  public static void main(String[] args) {
    System.out.println("Exercício da calculadora: ");
    Calculadora.somar(2.0, 2.0);
    Calculadora.subtrair(2, 2);
    Calculadora.dividir(2, 2);
    Calculadora.multiplicar(2, 2);

    System.out.println("Exercicio mensagem");
    Mensagem.obterMensagem(8);
    Mensagem.obterMensagem(15);
    Mensagem.obterMensagem(2);

    System.out.println("Exercicio emprestimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1200, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);
  }
}
