package br.com.eve.collection.set;

import java.util.*;

public class ExercicioProposto {
  public static void main(String[] args) {
    Map<String, Integer> populacaoPorEstado = new HashMap<String, Integer>() {
      {
        put("PE", 9616621);
        put("Al", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }
    };
    System.out.println(populacaoPorEstado);
    populacaoPorEstado.put("RN", 3534165);
    System.out.println(populacaoPorEstado);

    System.out.println("--\tVerifique se o estado PB\t--");
    System.out.println(populacaoPorEstado.containsKey("PD"));
    System.out.println("--\tInclua o estado PB\t--");
    populacaoPorEstado.put("PB", 4039277);
    System.out.println(populacaoPorEstado);
    System.out.println("--\tExiba a populacao PE\t--");
    System.out.println(populacaoPorEstado.get("PE"));
    System.out.println("--\tExiba na ordem que foram informados\t--");
    Map<String, Integer> populacaoPorEstado1 = new LinkedHashMap<String, Integer>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
      }
    };
    System.out.println(populacaoPorEstado1);
    System.out.println("--\tExiba na ordem alfabetica\t--");
    Map<String, Integer> populacaoPorEstado2 = new TreeMap<String, Integer>(populacaoPorEstado);
    System.out.println(populacaoPorEstado2);
    System.out.println("--\tExiba a menor população\t--");
    System.out.println(Collections.min(populacaoPorEstado.values()));
    System.out.println("--\tExiba a maior população\t--");
    System.out.println(Collections.max(populacaoPorEstado.values()));
    System.out.println("--\tExiba a soma população\t--");
    Iterator<Integer> it = populacaoPorEstado.values().iterator();
    Long soma = 0L;
    while (it.hasNext()) {
      soma += it.next();
    }
    System.out.println(soma);
    System.out.println("--\tExiba a media da população\t--");
    System.out.println((soma / populacaoPorEstado.size()));
    System.out.println("--\tRemova os estados < 4000000\t--");
    Iterator<Integer> it1 = populacaoPorEstado.values().iterator();
    while (it1.hasNext()) {
      if (it1.next() < 4000000)
        it1.remove();
    }
    System.out.println(populacaoPorEstado);
    System.out.println("--\tApague o dicionario\t--");
    populacaoPorEstado.clear();
    System.out.println("--\tConfira se esta vazio\t--");
    System.out.println(populacaoPorEstado.isEmpty());

  }
}
