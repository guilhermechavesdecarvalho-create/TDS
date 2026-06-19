package otimizacao;

import java.util.Scanner;

public class opcao_1 {
    public static void execucao1(){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        String cpf;
        
        System.out.println("===Cadrastro de Cliente===");
        System.out.println("Informe o nome do cliente: ");
        nome = entrada.nextLine();
        
        while(nome.trim().isEmpty()){
            System.out.println("ERRO! O nome do cliente nao pode ser vazio");
            System.out.println("Digite novamente o nome do cliente: ");
            nome = entrada.nextLine();
        }
        System.out.println("Infome a idade do cliente: ");
        idade = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Informe o cpf do " + nome + ": ");
        cpf = entrada.nextLine();
        
        System.out.println("Cliente: " + nome + "| Idade: " + idade + "| CPF: " + cpf);
        
        academia.nomesCadastrados.add(nome);
    }
}
