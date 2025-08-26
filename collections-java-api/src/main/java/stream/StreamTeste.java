package main.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        while(true) {
            System.out.println("Digite um número[0 -> sair]: ");
            int num = input.nextInt();

            if (num == 0) break;

            lista.add(num);
        }

        lista = listaPorOrdemCrescente(lista);

        System.out.println("============================");
        lista.forEach(System.out::println);
    }

    public static List<Integer> listaPorOrdemCrescente(List<Integer> lista) {
        if (!lista.isEmpty()) {
            return lista.stream().sorted().toList();
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
