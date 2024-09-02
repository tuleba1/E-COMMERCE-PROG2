package ProdutosLoja;

public class Acessorios extends Produtos {
    private String material;
    private String tipo;

    public Acessorios(String nome, Double preco, int estoque, String material, String tipo) {
        super(nome, preco, estoque);
        this.material = material;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public String getTipo() {
        return tipo;
    }
}
