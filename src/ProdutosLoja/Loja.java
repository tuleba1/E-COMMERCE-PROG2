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
        


        roupas.add(new Roupa("Camiseta UV", 149.90, ,"M", "Preto"));
        roupas.add(new Roupa("Camisa Regata", 74.90, 55 ,"G", "Branco"));
        roupas.add(new Roupa("Camiseta manga curta", 179.90, 23,"P", "Cinza"));
        roupas.add(new Roupa("Calção poliamida", 124.90, 18 ,"M", "Preto"));
        roupas.add(new Roupa("Bermuda Jeans X", 120.00, 44 ,"M", "Bege"));
        roupas.add(new Roupa("Bermuda Jeans Y", 128.90, 11 ,"G", "Preto"));
        roupas.add(new Roupa("Calça Legging", 100.00, 80 ,"PP", "Preto"));
        roupas.add(new Roupa("Top Feminino", 89.90, 8 ,"P", "Vermelho"));


        acessorios.add(new Acessorios("Bandana" ,55.30, 100, "Algodão" , "Esportivo"));
        acessorios.add(new Acessorios("Óculos de ciclísmo" ,200.25, 39, "Policarbonato" , "Esportivo"));
        acessorios.add(new Acessorios("Relógio tecnológico" ,500.00, 55, "Silicone" , "Esportivo/Tecnologia"));
        acessorios.add(new Acessorios("Meias cano curto" ,35.00, 111, "Algodão/Poliamida" , "Casual/Esportivo"));
        acessorios.add(new Acessorios("Meias cano médio" ,40.00, 100, "Algodão/Poliamida" , "Casual/Esportivo"));
        acessorios.add(new Acessorios("Viseira" ,22.30, 77, "Poliéster" , "Casual/Esportivo"));


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
