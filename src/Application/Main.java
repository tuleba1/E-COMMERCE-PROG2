package Application;

import ClienteEcommerce.Cliente;
import LojaProdutos.CarrinhodeCompras;
import LojaProdutos.Compra;
import ProdutosLoja.Acessorios;
import ProdutosLoja.Loja;
import ProdutosLoja.Roupa;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a loja! Escolha uma opção: ");
        System.out.println("1. Ver roupas.");
        System.out.println("2. Ver acessórios.");
        System.out.println("3. Sair da loja.");
        int opcao = sc.nextInt();


        if(opcao == 1){
            loja.mostrarRoupas();
        }
        else if(opcao == 2){
            loja.mostrarAcessorios();
        }
        else if(opcao == 3){
            System.out.println("Saindo do aplicativo.");
            exit(0);
        }
        else{
            System.out.println("Opção inválida.");
        }
    }

}