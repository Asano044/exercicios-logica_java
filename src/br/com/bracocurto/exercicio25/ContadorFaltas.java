package br.com.bracocurto.exercicio25;

import java.util.Scanner;

//Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de
// faltas for maior que 15, ele é reprovado por falta.
public class ContadorFaltas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno: ");
        String nome = leitura.nextLine();
        System.out.println("Informe a quantidade de faltas que ele possui: ");
        int faltas = leitura.nextInt(); leitura.nextLine();
        condicaoFaltas(faltas);
    }

    private static void condicaoFaltas(int faltas) {
        if (faltas > 15) {
            System.out.println("Ele foi reprovado, pois já tem mais de 15 faltas, possuindo: " + faltas);
        } else {
            System.out.println("Ele não foi reprovado, precisa de 16 faltas e ele tem: " + faltas);
        }
    }
}
