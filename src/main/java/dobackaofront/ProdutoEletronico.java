package dobackaofront;

public class ProdutoEletronico extends Produtos{
    private String marca;
    private int garantia;

    public ProdutoEletronico() {
        super(); // chama o construtor vazio da classe Produtos, garantindo que os atributos da superclasse sejam inicializados
    }

    public ProdutoEletronico(String nome, double preco, int quantidade, String marca, int garantia) {
        super(nome, preco, quantidade); // chama o construtor da superclasse Produtos que inicializa nome, preco e quantidade
        this.setMarca(marca);
        this.setGarantia(garantia);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public double calcularPreco() {
        if (getPreco() >= 500) {
            setPreco(getPreco() * 0.5);
        }
        return getPreco();//return preco normal
    }

    public void exibirProduto() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço com desconto: %.2f€%n", calcularPreco());
        System.out.println("Quantidade existente: " + getQuantidade());
        System.out.println("Data de Validade: " + getMarca());
        System.out.println("Dias para validade: " + getGarantia());
    }
}
