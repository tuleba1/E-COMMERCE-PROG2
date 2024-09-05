package ProdutosLoja;

import LojaProdutos.VarianteProduto;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String nome;
    private Double preco;
    private List<VarianteProduto> variantes;

    public Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.variantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<VarianteProduto> getVariantes() {
        return variantes;
    }

    public void adicionarVariantes(String tamanho, int estoque){
        variantes.add(new VarianteProduto(tamanho, estoque));
    }

    @Override
    public String toString(){
        StringBuilder detalhes = new StringBuilder(nome + "- R$ " + preco + "\n");
        for(VarianteProduto v : variantes){
            detalhes.append(v.toString() + "\n");
        }
        return detalhes.toString();
    }
}
