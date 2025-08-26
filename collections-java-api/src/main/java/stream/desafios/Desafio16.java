package main.java.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        System.out.println("Lista de numeros pares:");
        numeros.stream().filter(n -> n % 2 == 0).toList().forEach(System.out::println);
        System.out.println("Lista de numeros impares:");
        numeros.stream().filter(n -> n % 2 != 0).toList().forEach(System.out::println);
    }
}
