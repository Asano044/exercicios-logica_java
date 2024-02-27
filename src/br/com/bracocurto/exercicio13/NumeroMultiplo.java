package br.com.bracocurto.exercicio13;

import java.util.Scanner;

//Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo
public class NumeroMultiplo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = leitura.nextInt(); leitura.nextLine();
        System.out.println("Informe o segundo valor: ");
        int valor2 = leitura.nextInt(); leitura.nextLine();

        verificarMultiplo(valor1, valor2);
    }

    private static void verificarMultiplo(int valor1, int valor2) {
        int auxiliar = 0;
        for (int contador = 1; contador <= 1000; contador++) {
            auxiliar = valor2*contador;
            if (auxiliar == valor1) {
                System.out.printf("O valor 1 é múltiplo do valor 2, pois %d * %d = %d", valor2, contador, auxiliar);
                break;
            }
        }
        if (auxiliar != valor1) {
            System.out.println("O valor 1 não é múltiplo do valor 2.");
        }
    }
}
