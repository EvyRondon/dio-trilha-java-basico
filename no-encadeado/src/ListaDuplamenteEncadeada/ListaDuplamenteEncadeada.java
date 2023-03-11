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
      novoNo.setNoPrevious(noAux.getNoPrevious());
      novoNo.getNoProximo().setNoPrevious(novoNo);
      ;
    } else {
      novoNo.setNoPrevious(ultimoNo);
      ultimoNo = novoNo;
    }

    if (index == 0) {
      primeiroNo = novoNo;
    } else {
      novoNo.getNoPrevious().setNoProximo(novoNo);
    }

    tamanhoLista++;
  }

  public void remove(int index) {
    if (index == 0) {
      primeiroNo = primeiroNo.getNoProximo();
      if (primeiroNo != null) {
        primeiroNo.setNoPrevious(null);
      }
    } else {
      NoDuplo<T> noAuxiliar = getNo(index);
      noAuxiliar.getNoPrevious().setNoProximo(noAuxiliar.getNoProximo());
      if (noAuxiliar != ultimoNo) {
        noAuxiliar.getNoProximo().setNoPrevious(noAuxiliar.getNoPrevious());
      } else {
        ultimoNo = noAuxiliar;
      }
    }
    tamanhoLista--;
  }

  @Override
  public String toString() {
    String strRetorno = "";
    NoDuplo<T> noAuxiliar = primeiroNo;
    for (int i = 0; i < size(); i++) {
      strRetorno += "[No {conteudo=" + noAuxiliar.getConteudo() + "}]--->";
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    strRetorno += "null";
    return strRetorno;
  }
}