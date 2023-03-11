package ListaCircular;

public class ListaCircular<T> {
  private No<T> head;
  private No<T> tail;
  private int tamanhoLista;

  public ListaCircular() {
    this.head = null;
    this.tail = null;
    this.tamanhoLista = 0;
  }

  public void add(T conteudo) {
    No<T> novoNo = new No<>(conteudo);
    if (this.tamanhoLista == 0) {
      this.head = novoNo;
      this.tail = this.head;
      this.head.setNoProximo(this.tail);
    } else {
      novoNo.setNoProximo(this.tail);
      this.head.setNoProximo(novoNo);
      this.tail = novoNo;
    }
    tamanhoLista++;
  }

  public void remove(int index) {
    if (index >= this.tamanhoLista)
      throw new IndexOutOfBoundsException("O índicec é maior que o tamanho da lista.");

    No<T> noAuxiliar = this.tail;
    if (index == 0) {
      this.tail = this.tail.getNoProximo();
      this.head.setNoProximo(this.tail);
    } else if (index == 1) {
      this.tail.setNoProximo(this.tail.getNoProximo().getNoProximo());
    } else {
      for (int i = 0; i < index - 1; i++) {
        noAuxiliar = noAuxiliar.getNoProximo();
      }
      noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
    }
    this.tamanhoLista--;
  }

  public T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private No<T> getNo(int index) {
    if (this.isEmpty())
      throw new IndexOutOfBoundsException("A lista está vazia");

    if (index == 0)
      return tail;

    No<T> noAuxiliar = this.tail;
    for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
  }

  public boolean isEmpty() {
    return this.tamanhoLista == 0 ? true : false;
  }

  public int size() {
    return this.tamanhoLista;
  }

  @Override
  public String toString() {
    String strRetorno = "";

    No<T> noAuxiliar = this.tail;
    for (int i = 0; i < this.size(); i++) {
      strRetorno += "No [conteudo=" + noAuxiliar.getConteudo() + "] --->";
      noAuxiliar = noAuxiliar.getNoProximo();
    }

    strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

    return strRetorno;
  }

}
