package br.com.bracocurto.exercicio14;

import java.util.Scanner;

// Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule
// quantos dias de vida ela tem.
public class DiasDeVida {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe sua idade em anos: ");
        int anos = leitura.nextInt(); leitura.nextLine();
        System.out.println("Informe sua idade em meses: ");
        int meses = leitura.nextInt(); leitura.nextLine();
        System.out.println("Informe sua idade em dias: ");
        int dias = leitura.nextInt(); leitura.nextLine();

        System.out.println("O total de dias em que você viveu é: " + calcularIdadeEmDias(anos, meses, dias));
    }

    private static int calcularIdadeEmDias(int anos, int meses, int dias) {
        return (anos * 365) + (meses * 30) + dias;
    }
}
