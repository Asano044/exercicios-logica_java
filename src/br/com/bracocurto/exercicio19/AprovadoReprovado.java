package br.com.bracocurto.exercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado
// ou reprovado. A média para aprovação é 7.
public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Float> notas = new ArrayList<>();

        for (int contador = 0; contador <= 2; contador++) {
            System.out.println("Informe a " + (contador+1) + "ª nota do aluno: ");
            notas.add(leitura.nextFloat()); leitura.nextLine();
        }verificarAprovacao(notas);
    }

    private static void verificarAprovacao(List<Float> notas) {
        float media = 0;
        for (int contador = 0; contador <= 2; contador++) {
            media = media + notas.get(contador);
        }
        media /= 3;

        if (media >= 7) {
            System.out.printf("Este aluno foi aprovado. Pois a media dele foi: %,.2f", media);
        } else {
            System.out.printf("Este aluno foi reprovado. Pois a média dele foi: %,.2f", media);
        }
    }
}
