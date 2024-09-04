package Application;

import ClienteEcommerce.Cliente;
import LojaProdutos.CarrinhodeCompras;
import LojaProdutos.Compra;
import ProdutosLoja.Acessorios;
import ProdutosLoja.Roupa;

public class Main {
    public static void main(String[] args) {
        Roupa camisa = new Roupa("Camisa Polo", 120.00, 50, "M", "Azul");
        Acessorios relogio = new Acessorios("Relógio de Pulso", 250.00, 30, "Couro", "Analógico");

        Cliente cliente = new Cliente("Maria Oliveira", "maria@gmail.com");

        CarrinhodeCompras carrinho = new CarrinhodeCompras();
        carrinho.adicionarProduto(camisa);
        carrinho.adicionarProduto(relogio);

        Compra compra = new Compra(cliente, carrinho.getProdutos());
        compra.exibirDetalhesCompra();
    }
}