package otimizacao_arrays;

import java.util.ArrayList;

public class exercicio05 {
    public static void main(String[]args){
        
       ArrayList<String> alunos = new ArrayList<>();
       
       alunos.add("Anderson");
       alunos.add("Guilherme, o fenomeno");
       alunos.add("Alex");
       alunos.add("Rafael");
       alunos.add("Matheus");
       
       System.out.println("===LISTA DE ALUNOS==");
       for(String aluno : alunos){
           System.out.println("-" + aluno);
       }
       System.out.println(); 
       
       String alunoRemovido = "Guilherme, o fenomeno";
       alunos.remove(alunoRemovido);
       
       System.out.println("NOTICIA TRISTE! O Aluno : " + alunoRemovido + " esta sendo removido da lista");
       System.out.println();
       
       System.out.println("======AVISO====== ");
       if(alunos.contains(alunoRemovido)){
           System.out.println("Atencao: " + alunoRemovido + " ainda esta na lista");
           
           
       }else{
           System.out.println("Remocao realizada com sucesso. O aluno: " + alunoRemovido + " nao esta mais na lista");
           
           System.out.println();
           System.out.println("Lista Atualizada: ");
           for(String aluno : alunos){
               System.out.println("-" + aluno);
       }
        
    }
    
}
}
