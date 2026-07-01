package Projetos.estoque;

import java.util.ArrayList;

public class listaAtualizada_estoque {
    public static void comprarProduto(ArrayList<String> lista, String produtoVendido){
        
        if(lista.remove(produtoVendido)){
            System.out.println("Sucesso: " + produtoVendido + " foi comprado e removido do estoque ");
            
        }else{
            System.out.println("Erro: " + produtoVendido + " nao foi encontrado no estoque");
        }
    }   
}
