package Projetos.academia_completo;

import java.util.ArrayList;

public class relatorio_academia {
    public static void gerarRelatorio(ArrayList<String> listaAlunos){
        System.out.println("\n==============================================");
        System.out.println("      RELATORIO GERAL DE ALUNOS CADASTRADOS   ");
        System.out.println("==============================================");
        
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado no sistema até o momento.");
            System.out.println("==============================================");
            return; 
        }
        
        System.out.println("Total de alunos ativos: " + listaAlunos.size()); // .size ->  serve para retornar o tamanho ou a quantidade de elementos 
        System.out.println("----------------------------------------------");
        System.out.printf("%-25s | %-15s\n", "NOME DO ALUNO", "CPF"); // %-25s E %-15s -> apenas estetica, serve para a largura da coluna 
        System.out.println("----------------------------------------------");

        
        for (String aluno : listaAlunos) {
           
            String[] partes = aluno.split(" - "); // separa o nome (indice 0)  e o CPF (indice 1)
            String nome = partes[0];
            
            // remove o texto "CPF: " para pegar apenas os nuemros 
            String cpf = partes[1].replace("CPF: ", "");

            
            System.out.printf("%-25s | %-15s\n", nome, cpf);
        }

        System.out.println("==============================================");
    }
}
    
