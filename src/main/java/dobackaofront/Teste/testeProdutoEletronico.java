package dobackaofront.Teste;

import dobackaofront.ProdutoEletronico;

import java.util.Scanner;

public class testeProdutoEletronico {

    public void testeProdutoEletronico() {
        // Produto 1 - construtor vazio + setters
        ProdutoEletronico p1 = new ProdutoEletronico();
        p1.setNome("Smartphone");
        p1.setPreco(1199);
        p1.setQuantidade(12);
        p1.setMarca("Samsung");
        p1.setGarantia(3);

        // Produto 2 - construtor com todos os parâmetros
        ProdutoEletronico p2 = new ProdutoEletronico("Headphones", 39.99, 42,"JBL",2);


        // Produto 3 (opcional) - dados pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite os dados do terceiro produto Eletronico:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após nextDouble()

        System.out.print("Quantidade existente: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.print("Qual a marca: ");
        String marca = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.print("Quantos anos de garantia: ");
        int garantia = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        ProdutoEletronico p3 = new ProdutoEletronico(nome, preco, quantidade,marca,garantia);

        // Exibir dados dos dois primeiros produtos
        System.out.println("=== Produto 1 ===");
        p1.exibirProduto();

        System.out.println("\n=== Produto 2 ===");
        p2.exibirProduto();

        System.out.println("\n=== Produto 3 (inserido pelo usuário) ===");
        p3.exibirProduto();
    }
}
