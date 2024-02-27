package br.com.bracocurto.exercicio12;


import java.util.Scanner;

// Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
public class CalculoIMC {
    public static void main(String[] args) {
        IMCService imcService = new IMCService();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe sua altura (Ex: 1,73): ");
        float altura = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Informe seu peso (Ex: 85,20): ");
        float peso = leitura.nextFloat(); leitura.nextLine();

        imcService.filtrarIMC(altura, peso);
    }
}
