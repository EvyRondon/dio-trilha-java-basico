public class Tabuada {
  public static void main(String[] args) {
    int num = 5, count = 1;
    while (count <= 3) {
      ++count;
      System.out.println("count " + count);
      num += count;
    }
    System.out.println(num);

  }
}
