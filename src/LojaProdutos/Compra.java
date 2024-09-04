package LojaProdutos;

import ClienteEcommerce.Cliente;
import ProdutosLoja.Produtos;

import java.util.Date;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Produtos> produtos;
    private double total;
    private Date dataCompra;

    public Compra(Cliente cliente, List<Produtos> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = calcularTotal();
        this.dataCompra = new Date();
    }

    private double calcularTotal() {
        double total = 0.0;
        for (Produtos produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirDetalhesCompra() {
        System.out.println("Compra realizada por: " + cliente.getNome());
        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Produtos adquiridos:");
        for (Produtos produto : produtos) {
            System.out.println("- " + produto.getNome() + " - R$" + produto.getPreco());
        }
        System.out.println("Total: R$" + total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    public Date getDataCompra() {
        return dataCompra;
    }
}
