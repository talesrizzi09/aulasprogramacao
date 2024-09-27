package aula33;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Arroz");
        lista.add("Rato");
        lista.add("Cuzcuz");
        lista.add("Arroz");
        System.out.println(lista);

    }
}
