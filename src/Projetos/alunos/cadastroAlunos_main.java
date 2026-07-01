package Projetos.alunos;

import Projetos.alunos.alunos_cadastro;
import java.util.ArrayList;

public class cadastroAlunos_main {
    public static void main(String[]args){
        
        ArrayList<String> lista = alunos_cadastro.nomesAlunos();
        
        System.out.println("---LISTA DE ALUNOS---");
        for(String aluno : lista){
            System.out.println("- " + aluno);
        }
        
    }
}
