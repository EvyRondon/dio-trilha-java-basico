package Pilhas;

public class No {

  public No(int dado) {
    this.dado = dado;
  }

  public No() {
  }

  private int dado;
  private No refNo = null;

  public int getDado() {
    return dado;
  }

  public void setDado(int dado) {
    this.dado = dado;
  }

  public No getRefNo() {
    return refNo;
  }

  public void setRefNo(No refNo) {
    this.refNo = refNo;
  }

  @Override
  public String toString() {
    return "No{" + dado + "}";
  }

}
