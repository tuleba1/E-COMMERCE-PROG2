package ProdutosLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Loja {
    private List<Roupa> roupas;
    private List<Acessorios> acessorios;

    public Loja(){
        this.roupas = new ArrayList<>();
        this.acessorios = new ArrayList<>();

        Roupa camisaUv = new Roupa("Camiseta UV", 149.90,  "Preto");
        camisaUv.adicionarVariantes("PP", 25);
        camisaUv.adicionarVariantes("P", 32);
        camisaUv.adicionarVariantes("M", 43);
        camisaUv.adicionarVariantes("G", 18);
        camisaUv.adicionarVariantes("GG", 11);

        Roupa camisaRegata = new Roupa("Camisa Regata", 74.90,  "Branco");
        camisaRegata.adicionarVariantes("PP", 23);
        camisaRegata.adicionarVariantes("P", 28);
        camisaRegata.adicionarVariantes("M", 11);
        camisaRegata.adicionarVariantes("G", 32);
        camisaRegata.adicionarVariantes("GG", 22);



    }

    public void mostrarRoupas(){
        System.out.println("Roupas disponíveis: ");
        for(Roupa roupa : roupas){
            System.out.println(roupa);
        }
    }

    public void mostrarAcessorios(){
        System.out.println("Acessórios disponíveis: ");
        for(Acessorios acessorio : acessorios){
            System.out.println(acessorio);
        }
    }

}
