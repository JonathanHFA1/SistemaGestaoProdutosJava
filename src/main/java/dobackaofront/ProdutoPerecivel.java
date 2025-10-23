package dobackaofront;
//Produto perecivel: classe que define as características e comportamentos de um produto.
public class ProdutoPerecivel extends Produtos {

    private String dataValidade;
    private int diasVenda;

    public ProdutoPerecivel() {
        super(); // chama o construtor vazio da classe Produtos, garantindo que os atributos da superclasse sejam inicializados
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade, int diasVenda) {
        super(nome, preco, quantidade); // chama o construtor da superclasse Produtos que inicializa nome, preco e quantidade
        this.setDataValidade(dataValidade);
        this.setDiasVenda(diasVenda);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getDiasVenda() {
        return diasVenda;
    }

    public void setDiasVenda(int diasVenda) {
        this.diasVenda = diasVenda;
    }

    @Override
    public double calcularPreco() {
        if (diasVenda <= 3) {
            return getPreco() * 0.5; // desconto de 50%
        } else if (diasVenda <= 7) {
            return getPreco() * 0.7; // desconto de 30%
        } else {
            return getPreco(); // preço normal
        }
    }
    public void exibirProduto() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço com desconto: %.2f€%n", calcularPreco());
        System.out.println("Quantidade existente: " + getQuantidade());
        System.out.println("Data de Validade: " + getDataValidade());
        System.out.println("Dias para validade: " + getDiasVenda());
    }

}
