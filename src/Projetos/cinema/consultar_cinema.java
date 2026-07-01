package Projetos.cinema;

import java.util.ArrayList;

public class consultar_cinema {
    public static void buscarFilme(ArrayList<String> lista, String termoBusca){
        
        boolean encontrado = false;
        
        System.out.println("---RESULTADO DA BUSCA---");
        for(String filme : lista){
            
            if(filme.toLowerCase().contains(termoBusca.toLowerCase())){
                System.out.println("[DISPONIVEL] -> " + filme);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Nenhum filme encontrado com o nome : \" " + termoBusca + " \" ");
        }
    }
}
