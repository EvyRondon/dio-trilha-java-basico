
public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTV smartTv = new SmartTV();

    System.out.println("TV ligada? " + (smartTv.ligada ? "Sim" : "Não"));
    System.out.println("Canal Atual ? " + smartTv.canal);
    System.out.println("Volume Atual ? " + smartTv.volume);
  }
}
