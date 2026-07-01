package Projetos.academia_completo;

import java.util.Scanner;

public class cadastroAluno_academia {
    public static String informacoes(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n---SISTEMA DE CADASTRO DE ALUNOS---");
        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        
        while(nome.trim().isEmpty()){
            System.out.println("ERRO! O nome do cliente nao pode ser vazio");
            System.out.println("Digite novamente o nome do cliente: ");
            nome = entrada.nextLine();
        }
        System.out.println("Informe o cpf do cliente " + nome + ":");
        String cpf = entrada.nextLine();
        
        while(!cpf.matches("\\d{11}")){ // \\d -> serve para restringir apenas valores numericos (0-9) E {11} -> serve para que o usuario digite apenas 11 vezes
            System.out.println("ERRO: O cpf deve conter apenas 11 digitos numericos");
            System.out.println("Digite novamente o cpf do cliente " + nome + ":");
            cpf = entrada.nextLine();
        }
        System.out.println("Aluno: " + nome + " cadastrado com sucesso");
        
        return nome + " -  CPF: " + cpf;
    }
}
