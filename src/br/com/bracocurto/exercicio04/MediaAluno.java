package br.com.bracocurto.exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a méd ia ponderada
// considerando pesos 2, 3 e 5 para as notas, respectivamente.
public class MediaAluno {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        List<Float> notas = new ArrayList<>();
        notas.add(0.0f);

        System.out.println("Informe o nome do(a) aluno(a): ");
        String nome = leitura.nextLine();

        for (int contador = 1; contador <= 3; contador++) {
            System.out.println("Informe a " + contador + "ª nota deste aluno(a): ");
            notas.add(leitura.nextFloat()); leitura.nextLine();
            if (notas.get(contador) < 0 && notas.get(contador) > 10) {
                System.out.println("Nota inválida");
                break;
            }
        }
        System.out.println("A média das notas do aluno(a) " + nome + " é: " + calcularMedia(notas));
    }

    private static float calcularMedia(List<Float> notas) {
        return ((notas.get(1) * 2) + (notas.get(2) * 3) + (notas.get(3) * 5)) / 10;
    }

}
