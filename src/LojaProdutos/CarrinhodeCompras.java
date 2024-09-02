package LojaProdutos;

import ProdutosLoja.Produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Produtos> produtos;

    public CarrinhodeCompras() {
        this.produtos = new ArrayList<>();
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

    public List<Produtos> getProdutos() {
        return produtos;
    }

}
