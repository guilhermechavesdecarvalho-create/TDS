package Projetos.academia_completo;

import java.util.ArrayList;

public class consultarAlunos_academia {
    public static void buscarAluno(ArrayList<String> lista, String termoBusca){
        
        boolean encontrado = false;
        
        System.out.println("\n----RESULTADO DA BUSCA----");
        for(String alunos : lista){
            
            if(alunos.toLowerCase().contains(termoBusca.toLowerCase())){
                System.out.println("[LOCALIZADO] -> " + alunos);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Nenhum aluno encontrado com essas informacoes: \" " + termoBusca + " \" " );
        }
    }
}
