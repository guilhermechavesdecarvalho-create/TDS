package Projetos.estacionamento;

import java.util.Scanner;

public class registroGeral_estacionamento {
    public static String [] cadastro(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n---BEM VINDO AO ESTACIONAMENTO DO SENAC---");
        System.out.println("Digite o nome do cliente: ");
        String nome = entrada.nextLine();
        
        while(nome.trim().isEmpty()){
            System.out.println("ERRO! O nome nao pode ser vazio");
            System.out.println("Digite novamente o nome do cliente: ");
            nome = entrada.nextLine();
        }
        System.out.println("Informe o cpf do/a  " + nome + ":");
        String cpf = entrada.nextLine();
        
        while(cpf.trim().isEmpty()){
            System.out.println("ERRO! O CPF nao pode ser vazio");
            System.out.println("Digite novamente o cpf: ");
            cpf = entrada.nextLine();
        }
        System.out.println("Digite a placa veiculo: ");
        String placa = entrada.nextLine();
        
        System.out.println("Cliente: " + nome + "| CPF: " + cpf + "| Placa do Veiculo: " + placa);
        
        return new String [] { nome , cpf, placa };
        
    }
}
