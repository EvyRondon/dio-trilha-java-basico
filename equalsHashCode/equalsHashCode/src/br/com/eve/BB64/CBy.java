package br.com.eve.BB64;

public class CBy extends CAx {
  protected int a;

  public CBy() {
    a += 3;
    b += 3;
  }

  public int op2(int x) {
    return x - a;
  }

  public static int op3(int x) {
    return x * 3;
  }
}
