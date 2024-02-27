package br.com.bracocurto.exercicio15;

import java.util.Scanner;

//Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
public class ReajusteSalarial2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor de seu salário: ");
        float salario = leitura.nextFloat(); leitura.nextLine();

        System.out.printf("Com o ajuste de 15, seu novo salário será de R$ %,.2f", reajustarSalario(salario));
    }

    private static float reajustarSalario(float salario) {
        return salario + (salario * 0.15f);
    }
}
