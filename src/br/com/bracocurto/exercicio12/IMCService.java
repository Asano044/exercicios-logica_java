package br.com.bracocurto.exercicio12;

public class IMCService {

    private float calcularIMC(float altura, float peso) {
        return peso / (altura*altura);
    }

    protected void filtrarIMC(float altura, float peso) {
        float pesoImc = calcularIMC(altura, peso);

        if (pesoImc <= 18.5f) {
            System.out.printf("Seu IMC está definido como magro, sendo: %,.2f", pesoImc);
        } else if (pesoImc > 18.5f && pesoImc <= 25.0f) {
            System.out.printf("Seu IMC está definido como normal, sendo: %,.2f", pesoImc);
        } else if (pesoImc > 25.0f && pesoImc <= 30.0f) {
            System.out.printf("Seu IMC está definido como sobrepeso, sendo: %,.2f", pesoImc);
        } else if (pesoImc > 30.0f && pesoImc <= 40.0f) {
            System.out.printf("Seu IMC está definido como obesidade, sendo: %,.2f", pesoImc);
        } else {
            System.out.printf("Seu ICM está definido como obesidade grave, sendo: %,.2f", pesoImc);
        }
    }

}
