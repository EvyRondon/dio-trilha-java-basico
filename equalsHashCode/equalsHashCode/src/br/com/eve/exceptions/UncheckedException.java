package br.com.eve.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
  public static void main(String[] args) {
    boolean continueLooping = true;
    do {
      String a = JOptionPane.showInputDialog("Numerador: ");
      String b = JOptionPane.showInputDialog("Denominador:");
      try {
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
        continueLooping = false;
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
        e.printStackTrace();
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero." + e.getMessage());
        e.printStackTrace();
      } finally {
        System.out.println("Chegou no finally!...");
      }
      System.out.println("O código continua..");
    } while (continueLooping);

  }

  public static int dividir(int a, int b) {
    return a / b;
  }
}
