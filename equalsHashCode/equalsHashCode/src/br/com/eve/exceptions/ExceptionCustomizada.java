package br.com.eve.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
  public static void main(String[] args) {
    String nomeDoArquivo = "romances-blake-crouch.txt";
    imprimirArquivoNoConsole(nomeDoArquivo);

    System.out.println("Apesar da exception ou não, o programa continua");
  }

  public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
    try {
      BufferedReader br = lerArquivo(nomeDoArquivo);
      String line = br.readLine();

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      do {
        bw.write(line);
        bw.newLine();
        line = br.readLine();
      } while (line != null);
      bw.flush();
      br.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null,
          "Revise o nome do arquivo que você deseja imprimir!" + e.getLocalizedMessage());
    } catch (ImpossivelAberturaDeArquivoException e) {
      JOptionPane.showMessageDialog(null,
          e.getMessage());
      e.printStackTrace();
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null,
          "Ocorreu um erro inesperado! Entre em contato com o suporte!");
      e.printStackTrace();
    } finally {
      System.out.println("Chegou no finally");
    }

  }

  private static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
    File file = new File(nomeDoArquivo);

    try {
      return new BufferedReader(new FileReader(file.getName()));
    } catch (FileNotFoundException e) {
      throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
    }
  }
}

class ImpossivelAberturaDeArquivoException extends Exception {
  private String nomeDoArquivo;
  private String diretorio;

  public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
    super("O arquivo " + nomeDoArquivo + "não foi encontrado no diretório " + diretorio);
    this.nomeDoArquivo = nomeDoArquivo;
    this.diretorio = diretorio;
  }

  @Override
  public String toString() {
    return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio + "]";
  }
}