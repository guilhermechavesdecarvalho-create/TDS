package construcao_guiada;

import java.util.Scanner;

public class exercicio04{
    
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu nome por gentileza: ");
        
        String nome = entrada.nextLine();
        
        System.out.println("Nome do aluno e: " + nome);
        
        System.out.println("Agora, informe sua idade: ");
        
        String idade = entrada.nextLine();
        
        System.out.println("Idade do aluno e: " + idade);
        
        System.out.println("Em qual turma o aluno esta? ");
        
        String turma = entrada.nextLine();
       
        System.out.println("O aluno pertence a turma: " + turma);
        
        entrada.close();
        
        
    }
}