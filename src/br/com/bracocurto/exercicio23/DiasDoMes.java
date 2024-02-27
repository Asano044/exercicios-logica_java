package br.com.bracocurto.exercicio23;

import java.util.Scanner;

//) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui.
// Considere apenas meses válidos.
public class DiasDoMes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto",
                "setembro", "outubro", "novembro", "dezembro"};
        int[] diasMeses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Infome o nome do mês que deseja saber os dias:");
        String resposta = leitura.nextLine();
    }

    private static void pesquisarMes(String resposta) {
        switch (resposta) {

        }
    }
}
