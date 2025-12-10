package CalculaDesconto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = leitura.nextDouble();

        System.out.println("Digite o valor do seu desconto: ");
        double desconto = leitura.nextDouble();

        double percentual = valor * (desconto / 100);
        double novoValor = valor - percentual;

        System.out.println(String.format("O valor %.2f com o desconto de %.2f é: R$ %.2f", valor, desconto, novoValor));
    }
}
