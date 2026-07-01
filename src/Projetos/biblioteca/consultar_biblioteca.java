package Projetos.biblioteca;

import java.util.ArrayList;

public class consultar_biblioteca {
    public static void buscarLivro(ArrayList<String> lista, String termoBusca){
        
        boolean encontrado = false;
        
        System.out.println("---RESULTADO DA BUSCA---");
        for(String livro : lista){
            
            if(livro.toLowerCase().contains(termoBusca.toLowerCase())){
                System.out.println("[DISPONIVEL] -> " + livro);
                encontrado = true;
                
            }
        }
        if(!encontrado){
            System.out.println("Nenhum livro encontrado com o nome: \"" + termoBusca + "\"");
        }
    }
}
