package br.com.eve.collection.map;

public class Livro {
  private String nome;
  private Integer paginas;

  public Livro(String nome, Integer paginas) {
    this.nome = nome;
    this.paginas = paginas;
  }

  public String getNome() {
    return nome;
  }

  public Integer getPaginas() {
    return paginas;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Livro other = (Livro) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (paginas == null) {
      if (other.paginas != null)
        return false;
    } else if (!paginas.equals(other.paginas))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
  }

}
