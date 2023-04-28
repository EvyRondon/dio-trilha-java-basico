package br.com.eve.BB64;

public class CAx {
  protected int a;
  protected int b;

  public CAx() {
    a *= 2;
    b *= 3;
  }

  {
    a = 1;
    b = 2;
  }

  public int op1(int x) {
    return op2(x) + op3(x) + b;
  }

  public int op2(int x) {
    return x + a;
  }

  public static int op3(int x) {
    return x * 2;
  }
}