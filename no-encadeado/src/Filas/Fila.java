package Filas;

public class Fila<T> {
  private No<T> refNoEntradaFila;

  public Fila() {
    this.refNoEntradaFila = null;
  }

  public void enqueue(T object) {
    No novoNo = new No(object);
    novoNo.setRefNo(refNoEntradaFila);
    refNoEntradaFila = novoNo;
  }

  public T fist() {
    if (!this.isEmpty()) {
      No primeiroNo = refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else {
          break;
        }
      }
      return (T) primeiroNo.getObject();
    }
    return null;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      No noAuxiliar = refNoEntradaFila;
      No primeiroNo = refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          noAuxiliar.setRefNo(null);
          break;
        }
      }
      return (T) primeiroNo.getObject();
    }
    return null;
  }

  public boolean isEmpty() {
    return refNoEntradaFila == null ? true : false;
  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No noAux = refNoEntradaFila;

    if (refNoEntradaFila != null) {
      while (true) {
        stringRetorno += "[No{Objeto=" + noAux.getObject() + "}]--->";
        if (noAux.getRefNo() != null)
          noAux = noAux.getRefNo();
        else {
          stringRetorno += "null";
          break;
        }
      }
    } else {
      return stringRetorno = "null";
    }

    return stringRetorno;
  }

}
