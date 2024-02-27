package br.com.bracocurto.exercicio20;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = leitura.nextInt(); leitura.nextLine();
        verificarParOuImpar(numero);
    }

    private static void verificarParOuImpar(int numero) {
        if (numero%2 == 0) {
            System.out.println("O número informado é par.");
        } else {
            System.out.println("O número informado é impar.");
        }
    }
}
