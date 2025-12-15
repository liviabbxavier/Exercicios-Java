package Fase2.ListaDeCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    private int escolha;
    private String item;
    Scanner leitura = new Scanner(System.in);

    ArrayList<String> lista = new ArrayList<>();

    public void listaDeCompras() {
        do {
            System.out.println("---Lista de compras---");
            System.out.println("---Escolha uma das opções abaixo---");
            System.out.println("1 - Adicionar um item");
            System.out.println("2 - Remover um item da lista");
            System.out.println("3 - Ver a quantidade de itens");
            System.out.println("4 - Ver os itens da lista");
            System.out.println("5 - Sair");
            escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1:
                    adicionaItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    System.out.println("Sua lista possui " + lista.size() + " item(ns).");
                    break;
                case 4:
                    verificaLista();
                    break;
                default:
                    break;
            }
        } while (escolha != 5);
        System.out.println("Programa escerrado!");
    }

    public void adicionaItem() {
        System.out.println("Digite o item para adicionar...");
        item = leitura.nextLine();
        lista.add(item);
        System.out.println("Item adicionado à lista com sucesso!");
    }

    public void removeItem() {
        System.out.println("Digite o item que você deseja remover...");
        item = leitura.nextLine();
        lista.remove(item);
        System.out.println("Item removido com sucesso!");
    }

    public void verificaLista() {
        System.out.println("Verificando itens na lista...");
        if (lista.isEmpty()) {
            System.out.println("Você ainda não tem itens na lista.");
        } else {
            System.out.println("Item(ns) na lista: \n" + this.toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder limpo = new StringBuilder();
        for (String item : lista) {
            limpo.append(item).append("\n");
        }
        return limpo.toString();
    }
}
