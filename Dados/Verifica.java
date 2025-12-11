package Dados;

import java.util.Scanner;

public class Verifica {
    public void parImpar() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número par ou ímpar...");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este número é par!");
        } else {
            System.out.println("Este número é ímpar!");
        }
    }

    public void positivoNegativo() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo para verificação...");
        int numero = leitura.nextInt();
         if (numero < 0) {
            System.out.println("Este número é negativo!");
         } else if (numero == 0) {
            System.out.println("O número que você digitou é 0!");
         } else {
            System.out.println("Este número é positivo!");
         }
    }

    public void anoBissexto() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um ano...");
        int ano = leitura.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Este ano é bissexto!");
        } else {
            System.out.println("Este ano não é bissexto!");
        }
    }
}
