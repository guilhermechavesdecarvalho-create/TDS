package Projetos.estoque;

import Projetos.estoque.cadastro_estoque;
import java.util.ArrayList;

public class estoque_main {
    public static void main(String[]args){
        
        ArrayList<String> meuEstoque = cadastro_estoque.listaProdutos();
        
        System.out.println("Estoque Inicial: " + meuEstoque);
        System.out.println("===========================================");
        
        listaAtualizada_estoque.comprarProduto(meuEstoque, "Notebook");
        
        listaAtualizada_estoque.comprarProduto(meuEstoque, "Teclado Mecanico");
        
        System.out.println("============================================");
        System.out.println("Estoque Atualizada: " + meuEstoque);
    }
}
