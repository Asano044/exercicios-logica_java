package br.com.bracocurto.exercicio16;

import java.util.Scanner;

//Faça um programa que verifique se um número é positivo, negativo ou zero.
public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        float valor = leitura.nextFloat(); leitura.nextLine();
        verificarPositivoNegativo(valor);
    }

    private static void verificarPositivoNegativo(float valor) {
        if (valor > 0) {
            System.out.println("Este número é positivo.");
        } else if (valor < 0) {
            System.out.println("Este número é negativo.");
        } else {
            System.out.println("O valor é igual a 0.");
        }
    }
}
