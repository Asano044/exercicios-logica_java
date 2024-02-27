package br.com.bracocurto.exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Float> notas = new ArrayList<>();

        for (int contador = 0; contador <= 2; contador++) {
            System.out.println("Informe a " + (contador+1) + "ª nota: ");
            notas.add(leitura.nextFloat());
            leitura.nextLine();
        }

        System.out.printf("A média aritmética correspondete às notas é; %,.2f", calcularMedia(notas));
    }

    private static float calcularMedia(List<Float> notas) {
        float media = 0;
        for (int contador = 0; contador <= 2; contador++) {
            media += notas.get(contador);
        }
        return media/3;
    }
}
