package br.com.bracocurto.exercicio18;

import java.util.Scanner;

//Crie um programa que leia dois números inteiros e exiba o maior deles.
public class MaiorNumero {
    static final String MAIOR_VALOR = "O maior valor é: ";
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = leitura.nextInt(); leitura.nextLine();
        System.out.println("Informe o segundo valor: ");
        int valor2 = leitura.nextInt(); leitura.nextLine();
        verificarMaior(valor1, valor2);
    }

    private static void verificarMaior(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println(MAIOR_VALOR + valor1);
        } else if (valor1 < valor2) {
            System.out.println(MAIOR_VALOR + valor2);
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}
