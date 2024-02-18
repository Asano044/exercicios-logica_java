package br.com.bracocurto.exercicio05;

import java.util.Scanner;

//Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago
// com desconto de 10% se a quantidade for maior que 10 unidades.
public class precoProduto {

    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o nome do produto do produto: ");
        String nome = leitura.nextLine();
        System.out.println("Informe o preço deste produto: ");
        float preco = leitura.nextFloat(); leitura.nextLine();
        System.out.println("Informe a quantidade comprada deste produto: ");
        int quantidade = leitura.nextInt(); leitura.nextLine();

        System.out.println("O total a ser pago do produto " + nome + " foi: " + calcularPreco(preco, quantidade));

    }

    private static float calcularPreco(float preco, int quantidade) {
        float valor = preco * quantidade;
        if (quantidade > 10) {
            valor = valor - (valor*0.10f);
        }
        return valor;
    }
}
