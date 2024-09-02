package LojaProdutos;

import ClienteEcommerce.Cliente;

import java.util.Date;

public class Compra {
    private Cliente cliente;
    private CarrinhodeCompras carrinho;
    private Date dataPedido;

    public Compra(Cliente cliente, CarrinhodeCompras carrinho, Date dataPedido) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.dataPedido = dataPedido;
    }

    public void finalizarPedido() {
        double total = carrinho.calcularTotal();
        System.out.println("Pedido finalizado para " + cliente.getNome() + "No valor de R$" + total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public CarrinhodeCompras getCarrinho() {
        return carrinho;
    }

    public Date getDataPedido() {
        return dataPedido;
    }
}
