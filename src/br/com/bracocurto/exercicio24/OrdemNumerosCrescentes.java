package br.com.bracocurto.exercicio24;

import java.util.*;

//Crie um programa que leia três números inteiros e exiba-os em ordem crescente.
public class OrdemNumerosCrescentes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int contador = 0; contador < 3; contador++) {
            System.out.println("Informe o " + (contador+1) + "° valor: ");
            numeros.add(leitura.nextInt()); leitura.nextLine();
        }

        comparador(numeros);
        System.out.println(numeros);
    }

    private static void comparador(List<Integer> numeros) {
        numeros.add(0);
        int auxiliar;
        for (int contador = 0; contador < 2; contador++) {
            for (int contador2 = 0; contador2 < 2; contador2++) {
                if (numeros.get(contador2)  > numeros.get((contador2+1) )) {
                    auxiliar = numeros.get(contador2);
                    System.out.println("primeiro" + numeros);
                    numeros.set(contador2, numeros.get(contador2+1));
                    System.out.println("segundo" + numeros);
                    numeros.set(contador2+1, auxiliar);
                    System.out.println("ultimo" + numeros);
                }
            }
        }
        numeros.remove(3);
    }
}