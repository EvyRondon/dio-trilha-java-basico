package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

  private NoDuplo<T> primeiroNo;
  private NoDuplo<T> ultimoNo;

  private int tamanhoLista = 0;

  public ListaDuplamenteEncadeada() {
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanhoLista = 0;
  }

  public int size() {
    return tamanhoLista;
  }

  public T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private NoDuplo<T> getNo(int index) {
    NoDuplo<T> noAuxiliar = primeiroNo;
    for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
  }

  public void add(T elemento) {
    NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevious(ultimoNo);
    if (primeiroNo == null) {
      primeiroNo = novoNo;
    }
    if (ultimoNo != null) {
      ultimoNo.setNoProximo(novoNo);
    }
    ultimoNo = novoNo;
    tamanhoLista++;
  }

  public void add(T elemento, int index) {
    NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
    NoDuplo<T> noAux = getNo(index);
    novoNo.setNoProximo(noAux);

    if (novoNo.getNoProximo() != null) {
      novoNo.setNoPrevio(noAux.getNoPrevio());
      novoNo.getNoProximo().setNoPrevious(novoNo);
      ;
    } else {
      novoNo.setNoPrevio(ultimoNo);
      ultimoNo = novoNo;
    }
  }
}