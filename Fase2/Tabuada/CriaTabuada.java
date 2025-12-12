package Fase2.Tabuada;

import java.util.Scanner;

public class CriaTabuada {
    private int escolha;
    private int numero;
    private int primeiroNum;
    private int segundoNum;

    public void tabuada() {
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("---Escolha uma das opções abaixo---");
            System.out.println("1 - Consultar a tabuada de um número");
            System.out.println("2 - Fazer uma multiplicação");
            System.out.println("3 - Sair");
            escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite um número para consultar a sua tabuada até o 10...");
                    numero = leitura.nextInt();
                    leitura.nextLine();
                    consulta();
                    break;
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    primeiroNum = leitura.nextInt();
                    leitura.nextLine();
                    System.out.println("Digite o segundo número: ");
                    segundoNum = leitura.nextInt();
                    leitura.nextLine();
                    multiplicacao();
                    break;
                default:
                    break;
            }
        } while (escolha != 3);
        System.out.println("Programa encerrado, até logo!");
    }

    public void consulta() {
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }

    public void multiplicacao() {
        System.out.println(primeiroNum + " X " + segundoNum + " = " + (primeiroNum * segundoNum));
    }
}
