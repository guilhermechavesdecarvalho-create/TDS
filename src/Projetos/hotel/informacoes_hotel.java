package Projetos.hotel;

import java.util.Scanner;
 
public class informacoes_hotel {
    public static String [] cadastrar(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("\n--- CADASTRO DE CLIENTE---");
        System.out.println("Digite o nome do cliente: ");
        String nome  = entrada.nextLine();
        
        while (nome.trim().isEmpty()){
            System.out.println("ERRO! O nome do cliente nao pode ficar vazio");
            System.out.println("Digite novamente o nome do cleinte: ");
            nome = entrada.nextLine();
         }
        
        System.out.println("Informe o cpf do " + nome + ":");
        String cpf = entrada.nextLine();
        
        while(cpf.trim().isEmpty()){
            System.out.println("ERRO! O cpf é um campo obrigatorio");
            System.out.println("Informe novamente o cpf do cliente: ");
            cpf = entrada.nextLine();
         }
        
        System.out.println("Cliente: " + nome  + " | CPF: " + cpf);
        
        return new String [] {nome, cpf };
    }
}
