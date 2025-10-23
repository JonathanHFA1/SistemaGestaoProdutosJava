package dobackaofront.Teste;
//Teste: classe para executar exemplos práticos, criar produtos, chamar métodos, e mostrar resultados para garantir que tudo funciona.

import dobackaofront.Produtos;

import java.util.Scanner;

public class testeProduto {

    public void testeProduto() {
        // Produto 1 - construtor vazio + setters
        Produtos p1 = new Produtos();
        p1.setNome("Detergente");
        p1.setPreco(8.99);
        p1.setQuantidade(10);

        // Produto 2 - construtor com todos os parâmetros
        Produtos p2 = new Produtos("Guardanapos", 0.99, 146);

        // Exibir dados dos dois primeiros produtos
        System.out.println("=== Produto 1 ===");
        p1.exibirProduto();

        System.out.println("\n=== Produto 2 ===");
        p2.exibirProduto();

        // Produto 3 (opcional) - dados pelo usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite os dados do terceiro produto Simples:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após nextDouble()

        System.out.print("Quantidade existente: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        Produtos p3 = new Produtos(nome, preco, quantidade);

        System.out.println("\n=== Produto 3 (inserido pelo usuário) ===");
        p3.exibirProduto();

    }
}
