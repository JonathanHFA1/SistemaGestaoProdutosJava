package dobackaofront.Teste;

import dobackaofront.ProdutoPerecivel;

import java.util.Scanner;
//Teste: classe para executar exemplos práticos, criar produtos, chamar métodos, e mostrar resultados para garantir que tudo funciona.
public class testeProdutoPerecivel {
    public void testeProduto() {
        // Produto 1 - construtor vazio + setters
        ProdutoPerecivel p1 = new ProdutoPerecivel();
        p1.setNome("Laranjas");
        p1.setPreco(1.59);
        p1.setQuantidade(20);
        p1.setDataValidade("01/11/2025");
        p1.setDiasVenda(12);

        // Produto 2 - construtor com todos os parâmetros
        ProdutoPerecivel p2 = new ProdutoPerecivel("Leite",1.12,34,"25/10/2025",4);
        // Produto 3 - construtor com todos os parâmetros
        ProdutoPerecivel p3 = new ProdutoPerecivel("Pao de Forma",0.22,20,"23/10/2025",2);

        // Exibir dados dos produtos criados automaticamente
        System.out.println("=== Produto Perecível 1 ===");
        p1.exibirProduto();
        System.out.println("\n=== Produto Perecível 2 ===");
        p2.exibirProduto();
        System.out.println("\n=== Produto Perecível 3 ===");
        p3.exibirProduto();

        // Produto 4 (opcional) - dados pelo usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite os dados do quarto produto Perecível (inserido pelo usuário):");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // consome o enter

        System.out.print("Quantidade existente: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // consome o enter antes de ler a próxima linha

        System.out.print("Data de Validade: ");
        String dataValidade = scanner.nextLine();
        scanner.nextLine(); // consome o enter antes de ler a próxima linha

        System.out.print("Dias de Venda: ");
        int diasVenda = scanner.nextInt();
        scanner.nextLine(); // consome o enter antes de ler a próxima linha

        ProdutoPerecivel p4 = new ProdutoPerecivel(nome, preco, quantidade,dataValidade,diasVenda);

        System.out.println("\n=== Produto 4 (inserido pelo usuário) ===");
        p4.exibirProduto();

    }
}
