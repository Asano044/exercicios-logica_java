package br.com.bracocurto.exercicio03;

import java.util.Scanner;

// Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
public class AreaTriangulo {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor da base do triangulo: ");
        float base = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Informe o valor da altura do triangulo: ");
        float altura = leitura.nextFloat(); leitura.nextLine();

        System.out.println("A área deste triângulo é: " + calcularArea(base, altura));
    }

    private static float calcularArea(float base, float altura) {
        return (base * altura) / 2;
    }
}
