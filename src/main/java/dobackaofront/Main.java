package dobackaofront;

import dobackaofront.Teste.testeProduto;
import dobackaofront.Teste.testeProdutoEletronico;
import dobackaofront.Teste.testeProdutoPerecivel;

public class Main {
    public static void main(String[] args) {
        // Executar teste dos produtos simples
        testeProduto testeSimples = new testeProduto();
        System.out.println("Executando testes de Produtos simples:");
        testeSimples.testeProduto();

        System.out.println("\n--------------------------------------\n");

        // Executar teste dos produtos perecíveis
        testeProdutoPerecivel testePerecivel = new testeProdutoPerecivel();
        System.out.println("Executando testes de Produtos Perecíveis:");
        testePerecivel.testeProduto();

        testeProdutoEletronico testeEletronico = new testeProdutoEletronico();
        System.out.println("Executando testes de Produtos Perecíveis:");
        testeEletronico.testeProdutoEletronico();
    }
}