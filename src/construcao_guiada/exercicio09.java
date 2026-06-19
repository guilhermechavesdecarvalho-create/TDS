package construcao_guiada;

import java.util.Scanner;

public class exercicio09{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        
        String nomeAluno = entrada.nextLine();
        
        System.out.println("O nome do aluno e: " + nomeAluno);
        
        System.out.println("O aluno " + nomeAluno + " esta matriculado?");
        
        String matricula = entrada.nextLine();
        
        if(matricula.equals("Guilherme")){
            System.out.println("Aluno esta matriculado");
            
        }else {
            System.out.println("Aluno nao matriculado");
            
        }
    entrada.close();
    }
}
        