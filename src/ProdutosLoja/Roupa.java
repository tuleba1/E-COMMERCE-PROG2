package ProdutosLoja;

public class Roupa extends Produtos{
    private String tamanho;
    private String cor;

    public Roupa(String nome, Double preco, int estoque, String tamanho, String cor) {
        super(nome, preco, estoque);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return super.toString() + "Tamanho: " + tamanho + " - Cor: " + cor;
    }
}
