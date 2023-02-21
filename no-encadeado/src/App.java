public class App {
    public static void main(String[] args) throws Exception {
        No<String> primeiroNo = new No<String>("Primeiro nó");
        No<String> segundoNo = new No<String>("Segundo no");
        No<String> terceiroNo = new No<String>("terceiro no");
        No<String> quartoNo = new No<String>("quarto no");
        primeiroNo.setProximoNo(segundoNo);
        segundoNo.setProximoNo(terceiroNo);
        terceiroNo.setProximoNo(quartoNo);
        System.out.println(primeiroNo);
        System.out.println(primeiroNo.getProximoNo());
        System.out.println(primeiroNo.getProximoNo().getProximoNo());
        System.out.println(primeiroNo.getProximoNo().getProximoNo().getProximoNo());
    }
}
