package br.com.bracocurto.exercicio22;

import java.util.Scanner;

//Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus.
// Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.
public class BonusSalarial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        float salario = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Seu salário somado com o bônus será de: " + reajusteSalarial(salario));
    }

    private static double reajusteSalarial(float salario) {
        if (salario>2000) {
            return salario + (salario*0.1);
        } else {
            return salario + (salario*0.05);
        }
    }
}
