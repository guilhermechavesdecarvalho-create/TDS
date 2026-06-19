package funcoes;

import java.util.Scanner;

public class exercicio02 {
    
    public static void cadastrarAluno( ){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        utilitarios.nomeAluno = entrada.nextLine();
        
        while(utilitarios.nomeAluno.trim().isEmpty()){
            System.out.println("OPS! O nome nao pode ser vazio");
            System.out.println("Digite novamente o seu nome: ");
            utilitarios.nomeAluno = entrada.nextLine();
        }
        System.out.println("Informe sua matricula: ");
        utilitarios.matriculaAluno = entrada.nextLine();
        
        
        System.out.println("Aluno cadastrado com sucesso !");
    }
}
