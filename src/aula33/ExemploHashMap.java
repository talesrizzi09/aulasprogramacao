package aula33;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("SP","Sao Paulo");
        capitais.put("MG","Belo Horizonte");
        capitais.put("RS", "Rio Grande");
        System.out.println(capitais);
    }
}
