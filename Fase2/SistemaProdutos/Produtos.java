package Fase2.SistemaProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    private String nome;
    private double preço;
    private int estoque;
    private int escolha;

    Scanner leitura = new Scanner(System.in);

    ArrayList<Produtos> lista = new ArrayList<>();

    public void menuProdutos() {
        Produtos produto1 = new Produtos();
        produto1.setNome("Ursinho");
        produto1.setPreço(200.00);
        produto1.setEstoque(3716);

        Produtos produto2 = new Produtos();
        produto2.setNome("Headset");
        produto2.setPreço(299.99);
        produto2.setEstoque(7420);

        Produtos produto3 = new Produtos();
        produto3.setNome("Capinha");
        produto3.setPreço(30.49);
        produto3.setEstoque(7570);

        Produtos produto4 = new Produtos();
        produto4.setNome("Fone");
        produto4.setPreço(89.99);
        produto4.setEstoque(8095);

        Produtos produto5 = new Produtos();
        produto5.setNome("Carregador");
        produto5.setPreço(19.99);
        produto5.setEstoque(8738);

        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produto4);
        lista.add(produto5);

        do {
            System.out.println("---Menu da loja---");
            System.out.println("1 - Vender um produto");
            System.out.println("2 - Aplicar desconto");
            System.out.println("3 - Adicionar estoque");
            System.out.println("4 - Sair");
            escolha = leitura.nextInt();
            leitura.nextLine();

            switch (escolha) {
                case 1:
                    vendeProduto();
                    break;
                case 2:
                    aplicaDesconto();
                    break;
                case 3:
                    adicionaEstoque();
                    break;
            }
        } while (escolha != 4);

        if (escolha == 4) {
            System.out.println("Programa encerrado...");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + getNome() + "\n" +
                "Preço: R$ " + getPreço() + "\n" +
                "Em estoque: " + getEstoque() + " uni.\n";
    }

    public void vendeProduto() {
        System.out.println("Selecione o produto que será vendido: ");

        for (Produtos p : lista) {
            System.out.println(p.getNome() + " (Quantidade em estoque: " + p.getEstoque() + ")");
        }

        String produto = leitura.nextLine();

        Produtos selecionado = null;
        for (Produtos p : lista) {
            if (p.getNome().equalsIgnoreCase(produto)) {
                selecionado = p;
                break;
            }
        }

        if (selecionado == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println("Quantidade a ser vendida: ");
        int quantidade = leitura.nextInt();
        leitura.nextLine();

        if (quantidade > selecionado.getEstoque()) {
            System.out.println("Estoque insuficiente!");
            return;
        }

        selecionado.setEstoque(selecionado.getEstoque() - quantidade);
        System.out.println("Venda realizada!");
        System.out.println("Novo estoque de " + selecionado.getNome() + ": " + selecionado.getEstoque());
    }

    public void aplicaDesconto() {
        System.out.println("Selecione o produto em que o desconto será aplicado: ");

        for (Produtos p : lista) {
            System.out.println(p.getNome() + " (Preço: R$ " + p.getPreço() + ")");
        }

        String produto = leitura.nextLine();

        Produtos selecionado = null;
        for (Produtos p : lista) {
            if (p.getNome().equalsIgnoreCase(produto)) {
                selecionado = p;
                break;
            }
        }

        if (selecionado == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println("Digite o desconto percentua que será aplicado...");
        double desconto = leitura.nextDouble();
        leitura.nextLine();

        double temDesconto = selecionado.getPreço() * (desconto / 100);
        double novoPreco = selecionado.getPreço() - temDesconto;

        selecionado.setPreço(novoPreco);
        System.out.println("Desconto aplicado!");
        System.out.println("Novo valor com desconto do produto " + selecionado.getNome() + ": R$ " + novoPreco);
    }

    public void adicionaEstoque() {
        System.out.println("Selecione o produto desejado...");
        for (Produtos p : lista) {
            System.out.println(p.getNome() + " (Estoque atual: " + p.getEstoque() + ")");
        }
        String produto = leitura.nextLine();
        Produtos selecionado = null;
        for (Produtos p : lista) {
            if (p.getNome().equalsIgnoreCase(produto)) {
                selecionado = p;
                break;
            }
        }
        if (selecionado == null) {
            System.out.println("Produto não encontrado!");
            return;
        }
        System.out.println("Digite a quantidade que deseja adicionar ao estoque...");
        int quantidade = leitura.nextInt();
        leitura.nextLine();

        selecionado.setEstoque(selecionado.getEstoque() +
                quantidade);
        System.out.println("Estoque atualizado do produto " +
                selecionado.getNome() + ": " + selecionado.getEstoque());
    }
}