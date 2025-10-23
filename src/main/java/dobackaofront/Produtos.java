package dobackaofront;
//Produto: classe que define as características e comportamentos de um produto.
public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;
    // Construtor com todos os parâmetros
    public Produtos() {

    }
    // Construtor com todos os parâmetros
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

//set e get - são conhecidos como métodos de acesso e de modificação
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular preço (aqui retorna o preço original)
    public double calcularPreco() {
        return getPreco();
    }


    // Método para exibir os dados do produto
    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco + "€");
        System.out.println("Quantidade existente: " + quantidade);

    }



}


