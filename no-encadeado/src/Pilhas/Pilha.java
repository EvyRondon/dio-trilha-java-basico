package Pilhas;

public class Pilha {
  private No refNoEntradaPilha;

  public Pilha() {
    this.refNoEntradaPilha = null;
  }

  public boolean isEmpty() {
    return this.refNoEntradaPilha == null ? true : false;
  }

  public No top() {
    return this.refNoEntradaPilha;
  }

  public void push(No novoNo) {
    No noRefAux = this.refNoEntradaPilha;
    this.refNoEntradaPilha = novoNo;
    this.refNoEntradaPilha.setRefNo(noRefAux);
  }

  public No pop() {
    if (!isEmpty()) {
      No noPoped = refNoEntradaPilha;
      refNoEntradaPilha = refNoEntradaPilha.getRefNo();
      return noPoped;
    }
    return null;
  }

  @Override
  public String toString() {
    String strRetorno = "-------------------------\n";
    strRetorno += "        Pilha       \n";
    strRetorno += "-------------------------\n";

    No noAux = refNoEntradaPilha;
    while (true) {
      if (noAux != null) {
        strRetorno += "[No{dado= " + noAux.getDado() + "}]\n";
        noAux = noAux.getRefNo();
      } else
        break;
    }
    strRetorno += "-------------------------\n";
    return strRetorno;
  }
}
