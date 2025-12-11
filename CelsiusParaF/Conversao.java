package CelsiusParaF;

import java.util.Scanner;

public class Conversao {
    // double f = (celsius * multiplica) + 32;
    public void cParaF() {
        double multiplica = 1.8;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe quantos graus está fazendo hoje: ");
        double c = leitura.nextDouble();
        System.out.println("Fazendo a conversão para Fahrenheit...");
        double f = (c * multiplica) + 32;
        int fInt = (int) f;
        System.out.println("Seu resultado é: " + fInt + " °F");
    }
}
