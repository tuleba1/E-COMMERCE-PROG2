package LojaProdutos;

public class VarianteProduto {
    private String tamanho;
    private int estoque;

    public VarianteProduto(String tamanho, int estoque) {
        this.tamanho = tamanho;
        this.estoque = estoque;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Tamanho: " + tamanho + ", Estoque: " + estoque;
    }
}
