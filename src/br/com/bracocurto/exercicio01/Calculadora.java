package br.com.bracocurto.exercicio01;

import java.util.Scanner;

public class Calculadora {
    private static final String RESULTADO = "O resultado é: ";
    public static void main(String[]args) {
        System.out.println("Faça um programa que solicite dois números inteiros e exiba a soma, subtração, " +
                "multiplicação e divisão entre eles.");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        float valor1 = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Informe outro valor: ");
        float valor2 = leitura.nextFloat();  leitura.nextLine();

        System.out.println("Informe o sinal da operação entre: [somar/subtrair/multiplicacao/divisão]: ");
        String sinal = leitura.nextLine();

        switch(sinal) {
            case "somar" -> System.out.println(RESULTADO + soma(valor1, valor2));
            case "subtrair" -> System.out.println(RESULTADO + subtrair(valor1,valor2));
            case "multiplicacao" -> System.out.println(RESULTADO + multiplicacar(valor1, valor2));
            case "divisão" -> System.out.println(RESULTADO + dividir(valor1, valor2));
            default -> System.exit(0);
        }
    }

    private static float soma(float valor1, float valor2) {
        return valor1 + valor2;
    }

    private static float subtrair(float valor1, float valor2) {
        return valor1 - valor2;
    }

    private static float multiplicacar(float valor1, float valor2) {
        return valor1 * valor2;
    }

    private static float dividir(float valor1, float valor2) {
        return valor1 / valor2;
    }
}
