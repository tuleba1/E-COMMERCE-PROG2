package ProdutosLoja;

public class Roupa extends Produtos{
    private String tamanho;
    private String cor;

    public Roupa(String nome, Double preco, int estoque, String tamanho, String cor) {
        super(nome, preco, estoque);
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}
