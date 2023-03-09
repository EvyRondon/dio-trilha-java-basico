package ListaDuplamenteEncadeada;

public class NoDuplo<T> {
  private T conteudo;
  private NoDuplo<T> noProximo;
  private NoDuplo<T> noPrevious;

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public NoDuplo<T> getNoProximo() {
    return noProximo;
  }

  public void setNoProximo(NoDuplo<T> noProximo) {
    this.noProximo = noProximo;
  }

  public NoDuplo<T> getNoPrevious() {
    return noPrevious;
  }

  public void setNoPrevious(NoDuplo<T> noPrevious) {
    this.noPrevious = noPrevious;
  }

  public NoDuplo(T conteudo) {
    this.conteudo = conteudo;
  }

  @Override
  public String toString() {
    return "NoDuplo [conteudo=" + conteudo + "]";
  }
}
