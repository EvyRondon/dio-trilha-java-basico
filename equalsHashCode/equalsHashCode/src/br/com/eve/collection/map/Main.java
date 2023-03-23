package br.com.eve.collection.map;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, String> aluno = new HashMap<String, String>() {
      {
        put("Nome", "Evelym");
        put("Idade", "31");
        put("Media", "8.5");
        put("Turma", "3a");
      }
    };
    System.out.println(aluno);
    System.out.println(aluno.keySet());
    System.out.println(aluno.values());

    List<Map<String, String>> listaAlunos = new ArrayList<Map<String, String>>();
    listaAlunos.add(aluno);

    Map<String, String> aluno2 = new HashMap<String, String>() {
      {
        put("Nome", "Mateus");
        put("Idade", "21");
        put("Media", "8.2");
        put("Turma", "3a");
      }
    };

    listaAlunos.add(aluno2);

    System.out.println(listaAlunos);
    System.out.println(aluno.containsKey("Nome"));
  }

}
