package Fase2.Login;

import java.util.Scanner;

public class Sistema {
    private String username = "Bia";
    private int password = 123;
    private String tentaUser;
    private int tentaSenha;
    private int tentativa;

    public void validacao() {
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome de usuário: ");
            tentaUser = leitura.nextLine();

            if (tentaUser.equals(username)) {
                System.out.println("Seja bem-vindo(a), " + username);
            } else {
                System.out.println("Usuário incorreto, tente novamente.");
                tentativa++;
                continue;
            }

            System.out.println("Digite sua senha: ");
            tentaSenha = leitura.nextInt();
            leitura.nextLine();

            if (tentaSenha == password) {
                System.out.println("Você entrou!");
                break;
            } else {
                System.out.println("Senha incorreta, tente novamente.");
                tentativa++;
                continue;
            }
        } while (tentativa != 3);

        if (tentativa == 3) {
            System.out.println("Usuário bloqueado");   
        }
    }
}