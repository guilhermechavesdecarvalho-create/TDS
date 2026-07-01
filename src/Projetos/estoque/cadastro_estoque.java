package Projetos.estoque;

import java.util.ArrayList;

public class cadastro_estoque {
    public static ArrayList<String>  listaProdutos(){
        ArrayList<String> produtos = new ArrayList<>();
        
        produtos.add("Smartphone");
        produtos.add("Fones de Ouvido");
        produtos.add("Notebook");
        produtos.add("Smartwatch");
        produtos.add("Smart TV");
        produtos.add("Tablet");
        produtos.add("Power Bank");
        produtos.add("Roteador Wi-Fi");
        produtos.add("Console de Videogame");
        produtos.add("Caixa de Som Portátil");
        
        return produtos;
    }
}
