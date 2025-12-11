package Distancia;

import java.util.Scanner;

public class ConverteDistancia {
    public void mParaC() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a metragem que você deseja converter para centímetros: ");
        double metros = leitura.nextDouble();

        double centimetros = metros * 100;

        System.out.println(String.format("O valor convertido deste número é: %.2f", centimetros));
    }

    public void cParaM() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor em centímetros que você deseja converter para metros: ");
        double centimetros = leitura.nextDouble();

        double metros = centimetros / 100;

        System.out.println(String.format("O valor convertido deste número é: %.2f m", metros));
    }

    public void kParaM() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um valor em quilômetros que você deseja converter para metros: ");
        double quilômetros = leitura.nextDouble();

        double metros = quilômetros * 1000;

        System.out.println(String.format("Este valor fica igual a %.2f m", metros));
    }

    public void mParaK() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um valor em metros que você deseja converter para quilômetros: ");
        double metros = leitura.nextDouble();

        double quilômetros = metros * 1000;

        System.out.println(String.format("Este valor fica igual a %.2f m", quilômetros));
    }

    public void mParaMi() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a metragem que você deseja converter para milhas: ");
        double metros = leitura.nextDouble();

        double milhas = metros / 1609.344;
        System.out.println(String.format("O valor convertido é de %f mi", milhas));
    }
}
