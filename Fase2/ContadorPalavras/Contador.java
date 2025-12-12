package Fase2.ContadorPalavras;

import java.util.Scanner;

public class Contador {
    private int vogais;
    private int consoantes;

    Scanner leitura = new Scanner(System.in);

    public void contagem() {
        System.out.println("Escreva uma frase: ");
        String frase = leitura.nextLine().toLowerCase();
        // toLowerCase() deixa as letras em minúsculo

        String[] palavras = frase.trim().split("\\s+");
        int numero = palavras.length;

        // trim() remove espaços no início e no fim
        // split("\\s+") divide o texto por um ou mais espaços
        // palavras.length faz a contagem de palavras

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c >= 'a' && c <= 'z') { // verifica se é letra
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        String inverte = new StringBuilder(frase).reverse().toString();

        System.out.println("Sua frase tem " + numero + " palavras.");
        System.out.println(vogais + " vogais e " + consoantes + " consoantes.");
        System.out.println("Sua frase invertida ficaria assim: " + inverte);
    }
}
