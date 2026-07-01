package Projetos.academia_completo;

import java.util.ArrayList;

public class liberarAcesso_academia {
    public static void validacao(ArrayList<String> listaAlunos, String cpf){
        
        boolean autorizado = false;
        
        System.out.println("\n----CONTROLE DE ACESSO----");
        
        for(String aluno : listaAlunos){
            
            if(aluno.contains(cpf)){ // .conatains serve para saber se uma palavra ou letra esta dentro de um texto maior 
                System.out.println("ACESSO LIBERADO! Bem Vindo(a), " + aluno.split(" - ") [0] ); // .split -> serve para pegar a String e separar em varios pedaços 
                autorizado = true;
                break;
                
            }
        }
        if(!autorizado){
            System.out.println("ACESSO NEGADO! CPF (" + cpf + ") nao encontrado ");
        }
        
    }
}
