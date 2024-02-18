package br.com.bracocurto.exercicio02;

import java.util.Scanner;

//    Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.
public class RaioCirculo {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o valor do raio de um círculo");
        float raioCirculo = leitura.nextFloat();

        System.out.println("O perímetro deste círculo é: " + calcularPerimetroRaio(raioCirculo));
        System.out.println("A área do círculo é: " + calcularAreaCirculo(raioCirculo));
    }

    private static float calcularPerimetroRaio(float raioCirculo) {
        return (2 * 3.14f) * raioCirculo;
    }

    private static float calcularAreaCirculo(float raioCirculo) {
        return (raioCirculo * raioCirculo) * 3.14f;
    }
}
