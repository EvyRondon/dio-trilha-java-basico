package Filas;

public class Fila {
  private No refNoentradaFila;

  public Fila() {
    this.refNoentradaFila = null;
  }

  public void enqueue(No novoNo) {
    novoNo.setRefNo(refNoentradaFila);
    refNoentradaFila = novoNo;
  }

  public No dequeue() {
    if (!this.isEmpty()) {
      No noAuxiliar = refNoentradaFila;
      No primeiroNo = refNoentradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          noAuxiliar.setRefNo(null);
          break;
        }
      }
      return primeiroNo;
    }
    return null;
  }

  public No fist() {
    if (!this.isEmpty()) {
      No primeiroNo = refNoentradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else {
          break;
        }
      }
    }
    return null;
  }

  public boolean isEmpty() {
    return refNoentradaFila == null;
  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No noAux = refNoentradaFila;

    if (refNoentradaFila != null) {
      while (true) {
        stringRetorno += "[No{Objeto=" + noAux.getObject() + "}]";
        if (noAux.getObject() != null)
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
