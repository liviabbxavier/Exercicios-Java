package CalculaDesconto;

import java.util.Scanner;

public class Desconto {
    public void aplica() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = leitura.nextDouble();

        System.out.println("Digite o valor do seu desconto: ");
        double desconto = leitura.nextDouble();

        double percentual = valor * (desconto / 100);
        double novoValor = valor - percentual;

        System.out.println(String.format("O valor R$ %.2f com o desconto percentual de %.1f é: R$ %.2f", valor, desconto, novoValor));
    }
}
