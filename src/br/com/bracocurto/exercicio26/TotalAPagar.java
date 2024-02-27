package br.com.bracocurto.exercicio26;

import java.util.Scanner;

//Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago.
// Considere que cada produto tem um preço diferente.
public class TotalAPagar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String escolha = "";
        float acumuladora = 0f;
        while (!escolha.contains("n")) {
            menu();
            String nome = leitura.nextLine();

            System.out.println("Informe a quantidade comprada: ");
            int quantidade = leitura.nextInt(); leitura.nextLine();
            acumuladora += precoTotal(nome.toLowerCase(), quantidade);

            System.out.println("Comprou mais alguma coisa? [s/n]");
            escolha = leitura.nextLine();
        }

        System.out.printf("O total a ser pago da compra é de: %,.2f", acumuladora);
    }

    private static float precoTotal(String nome, int quantidade) {
        Mercado mercado = Mercado.fromPortugues(nome);
        return mercado.preco() * quantidade;
    }


    private static void menu() {
        System.out.println("Informe a opção do produto: ");
        System.out.println("Nescau: R$10,00 ");
        System.out.println("Coxinha: R$6,00");
        System.out.println("Arroz: R$23,90");
        System.out.println("Feijão: R$18,45\n");
        System.out.println("Qual produto você deseja: ");
    }

}
