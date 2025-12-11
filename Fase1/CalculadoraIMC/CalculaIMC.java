package CalculadoraIMC;

import java.util.Scanner;

public class CalculaIMC {
    // fórmula: IMC = peso / altura²
    // double p = 65.5;
    // double h = 1.63;
    // 

    public void calculaImc() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double p = leitura.nextDouble();
        System.out.println("Digite sua altura: ");
        double h = leitura.nextDouble();
        System.out.println("Fazendo o cálculo IMC...");
        double imc = (p / (h * h));
        System.out.println(String.format("Sua massa corporal é: %.2f", imc));
    }
}
