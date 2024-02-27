package br.com.bracocurto.exercicio21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são
// menores de idade e quantas são maiores de idade.
public class VerificarMenores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        String resposta = "";
        int contador = 0;

        while (!resposta.contains("n")) {
            System.out.println("Informe o nome do membro do grupo: ");
            nomes.add(leitura.nextLine());
            System.out.println("Informe a idade do " + nomes.get(contador));
            idades.add(leitura.nextInt()); leitura.nextLine();
            contador++;

            System.out.println("Deseja continuar? [s/n]: ");
            resposta = leitura.nextLine();
        }
        verificarMenoresEMaiores(nomes, idades);
    }

    private static void verificarMenoresEMaiores(List<String> nomes,List<Integer> idades) {
        for (int contador = 0; contador < idades.size(); contador++) {
            if (idades.get(contador) >= 18) {
                System.out.printf("%s é maior de idade, pois tem %d anos.%n", nomes.get(contador), idades.get(contador));
            } else {
                System.out.printf("%s é menor de idade, pois tem %d anos.%n", nomes.get(contador), idades.get(contador));
            }
//            Fim do IfElse
        }
//        Fim do for
    }

}
