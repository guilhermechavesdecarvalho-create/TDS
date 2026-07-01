package Projetos.biblioteca_completo;

import java.util.Scanner;

public class cadastrado_biblioteca {
    public static String informacoes(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n----CADASTRO DE CLIENTE----");
        System.out.println("Digite o nome do cliente: ");
        String nome = entrada.nextLine();
        
        while(nome.trim().isEmpty()){
            System.out.println("ERRO! O nome nao pode ser vazio");
            System.out.println("Digite novamente o nome do cliente: ");
            nome = entrada.nextLine();
        }
      
        System.out.println("Informe o cpf do cliente " + nome + ":");
        String cpf = entrada.nextLine();
        
        while(!cpf.matches("\\d{11}")){
            System.out.println("ERRO: O cpf deve conter apenas 11 digitos numericos");
            System.out.println("Digite novamente o cpf do cliente " + nome + ":");
            cpf = entrada.nextLine();
        }
        System.out.println("Aluno: " + nome + " cadastrado com sucesso");
        
        return nome + " -  CPF: " + cpf;
    }
}

    