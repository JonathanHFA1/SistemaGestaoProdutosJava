Sistema de Gestão de Produtos em Java
Este projeto implementa um sistema básico para gerenciamento de produtos de uma loja, organizado em três principais classes: Produto, ProdutoPerecivel e ProdutoEletronico, além de uma classe Venda para operações de vendas.

Funcionalidades
Produto: Armazena nome, preço e quantidade, com construtores, getters/setters, cálculo de preço e exibição dos dados.

ProdutoPerecivel: Estende Produto adicionando data de validade e dias até vencimento, aplicando descontos progressivos conforme a proximidade do vencimento.

ProdutoEletronico: Extende Produto com atributos de marca e garantia, com regras de cálculo de preço que consideram custos de entrega para valores altos.


Como usar
Compile as classes Java.

Execute as classes de teste para visualizar operações e inserir dados interativamente e teste diferentes tipos de produtos.

Este sistema demonstra princípios de orientação a objetos como encapsulamento, herança, polimorfismo e sobrescrita de métodos, aplicados a um contexto realista de gerenciamento de loja.
