package br.com.bracocurto.exercicio07;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o seu salário bruto: ");
        float salarioBruto = leitura.nextFloat(); leitura.nextLine();

        System.out.printf("você irá receber R$ %,.2f de salário líquido", calcularSalarioLiquido(salarioBruto));
    }

    private static float calcularSalarioLiquido(float salarioBruto) {
        return salarioBruto + (salarioBruto*0.05f);
    }

}