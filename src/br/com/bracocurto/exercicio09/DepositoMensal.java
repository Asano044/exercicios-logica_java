package br.com.bracocurto.exercicio09;

import java.util.Scanner;

// Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de
// juros mensal, e calcule o montante após 12 meses.
public class DepositoMensal {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor mensalmente depositado: ");
        float valorDepositado = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Informe agora a taxa de juros mensais: ");
        float taxaJuros = leitura.nextFloat(); leitura.nextLine();

        System.out.printf("O valor que a conta terá após 12 mêses é: %,.2f", calcularDeposito(valorDepositado, taxaJuros));
    }

    private static float calcularDeposito(float valorDepositado, float taxaJuros) {
        float depositoReajustado = valorDepositado - (valorDepositado*(taxaJuros/100));
        return depositoReajustado * 12;
    }
}
