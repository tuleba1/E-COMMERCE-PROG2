package ProdutosLoja;

public class Roupa extends Produtos{
    private String tamanho;
    private String cor;

    public Roupa(String nome, Double preco, String cor) {
        super(nome, preco);
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return super.toString() +"Cor: " + cor;
    }
}
