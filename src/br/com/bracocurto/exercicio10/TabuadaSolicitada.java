package br.com.bracocurto.exercicio10;

import java.util.Scanner;

//Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.
public class TabuadaSolicitada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número que deseja ver a tabuada do 1 ao 10: ");
        int numero = leitura.nextInt(); leitura.nextLine();

        exibirTabuada(numero);
    }

    private static void exibirTabuada(int numero) {
        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("%d * %d = %d%n", numero, contador, (numero*contador));
        }
    }
}
