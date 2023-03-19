package EBOO;

public class Veiculo {
  String cor;
  String modelo;
  int capacidadeTanque;

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  public double valorTotalEncherTanque(double valorCombustivel) {
    return valorCombustivel * this.capacidadeTanque;
  }
}
