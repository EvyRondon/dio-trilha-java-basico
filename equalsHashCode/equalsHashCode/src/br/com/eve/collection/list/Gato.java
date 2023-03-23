package br.com.eve.collection.list;

public class Gato implements Comparable<Gato> {
  private String nome;
  private Integer idade;
  private String cor;

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getCor() {
    return cor;
  }

  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }
}
