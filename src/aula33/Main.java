package aula33;

public class Main {
    public static void main(String[] args) {
        Lista<String> l1 = new Lista<String>(5);
        l1.adiciona("A");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        l1.adiciona("G");
        l1.adiciona("H");
        System.out.println(l1);

        System.out.println("obtendo o elemento da posição 2 "+ l1.obterElemento(2));
        try {
            System.out.println("obtendo o elemento da posição 20"+ l1.obterElemento(20));
        } catch (IllegalArgumentException e) {
            System.out.println("O elemento 20 n existe in lista");
        }
        System.out.println("Qual a posicao do elemento 'A' na lista? "+l1.posicaoDe("A"));
        System.out.println("Qual a posicao do elemento 'a' na lista? "+l1.posicaoDe("a"));
        l1.adiciona(1,"B");
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

    }
}
