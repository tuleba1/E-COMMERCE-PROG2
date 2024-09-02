package LojaProdutos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produtos> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<Produtos>();
    }

    public void adicionarProduto(Produtos produto) {
        if(produto.getEstoque() > 0) {
            produtos.add(produto);
            produto.setEstoque(produto.getEstoque() -1);
        }
        else{
            System.out.println("Produto está fora de estoque." + produto.getNome());
        }
    }
    public void removerProduto(Produtos produto) {
        produtos.remove(produto);
        produto.setEstoque(produto.getEstoque() + 1);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produtos produto : produtos) {
            total+=produto.getPreco();
        }
        return total;
    }

}
