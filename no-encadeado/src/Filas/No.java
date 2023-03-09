package Filas;

public class No<T> {
  private T object;
  private No<T> refNo;

  public No() {
  }

  public No(T object) {

    this.refNo = this.getRefNo() != null ? this.getRefNo() : null;
    this.object = object;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }

  public No<T> getRefNo() {
    return refNo;
  }

  public void setRefNo(No<T> refNo) {
    this.refNo = refNo;
  }

  @Override
  public String toString() {
    return "No [object=" + object + "]";
  }
}
