package ProdutosLoja;

public class Acessorios extends Produtos {
    private String material;
    private String tipo;

    public Acessorios(String nome, Double preco,String material, String tipo) {
        super(nome, preco);
        this.material = material;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString() + "- Material: " + material + "- Tipo: " + tipo;
    }
}
