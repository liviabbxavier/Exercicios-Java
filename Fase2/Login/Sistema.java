package Fase2.Login;

import java.util.Scanner;

public class Sistema {
    private String username = "Bia";
    private int password = 123;
    private String tentativas;
    private int tentativas1;

    public void validacao() {
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome de usuário: ");
            tentativas = leitura.nextLine();
            tentativas1++;

            if (tentativas == username) {
                System.out.println("Seja bem-vindo(a), " + username);
            } else if (tentativas1 == 3) {
                System.out.println("Usuário bloqueado");
            }else {
                System.out.println("Usuário incorreto, tente novamente.");
                tentativas1++;
            }
        } while(tentativas1 <= 3);
        //while (tentativas != username && tentativas1 != password) {
        //    System.out.println("Digite seu nome de usuário para entrar: ");
        //    String user = leitura.nextLine();

        //    if (user == username) {
        //        System.out.println("Seja bem-vindo(a) " + username);
        //    } else {
        //        System.out.println("Nome de usuário incorreto, tente novamente...");
        //        tentativas1++;
        //    }

        //    System.out.println("Digite sua senha: ");
        //    int senha = leitura.nextInt();
        //}

    }
}
