package br.com.bracocurto.exercicio17;

import java.util.Scanner;

//Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem
// indicando se ela é criança, adolescente, adulto ou idoso.
public class CategorizarIdades {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = leitura.nextInt(); leitura.nextLine();
        categorizar(idade);
    }

    private static void categorizar(int idade) {
        if (idade<12) {
            System.out.println("Você é uma criança");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 18 && idade < 50) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você já é um senhor de idade");
        }
    }
}
