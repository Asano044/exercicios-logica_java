package br.com.bracocurto.exercicio08;

import java.util.Scanner;

public class TrocarValores {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = leitura.nextInt(); leitura.nextLine();
        System.out.println("Informe o segundo valor: ");
        int valor2 = leitura.nextInt(); leitura.nextLine();

        inverterValores(valor1, valor2);

    }

    private static void inverterValores(int valor1, int valor2) {
        int auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;
        System.out.println("Os valores foram invertidos, o primeiro agora é:  " + valor1 + " e o segundo é: " + valor2);
    }

}
