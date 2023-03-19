import java.util.LinkedList;
import java.util.Queue;

import List2.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Carro> queueCar = new LinkedList<>();
        queueCar.add(new Carro("honda"));
        queueCar.add(new Carro("Toyota"));
        queueCar.add(new Carro("ford"));

        System.out.println(queueCar.add(new Carro("Renault")));
        System.out.println(queueCar);
        System.out.println(queueCar.offer(new Carro("Pegeot")));
        System.out.println(queueCar);
        System.out.println(queueCar.peek());
        System.out.println(queueCar);
        System.out.println(queueCar.poll());
        System.out.println(queueCar);
        System.out.println(queueCar.isEmpty());
        System.out.println(queueCar.size());

    }
}
