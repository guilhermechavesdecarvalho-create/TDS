package Projetos.academia;

import java.util.Scanner;

public class menu_academia {
    public static int exibirMenu(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("===BEM VINDO A ACADEMIA HEALTHY LIVING===");
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        while (nome.trim().isEmpty()){
            System.out.println("ERRO! O nome nao pode ser vazio");
            System.out.println("Informe novamente seu nome: ");
            nome = entrada.nextLine();
        }
        System.out.println("1.Ver Planos e Mensalidades");
        System.out.println("2.Agendar Avaliacao Fisica ");
        System.out.println("3.Ver Horarios de Funcionamento");
        System.out.println("0. Sair");
        System.out.println("Escolha uma das opcoes listadas acima por gentileza, " + nome + ":");
        
        int opcaoEscolhida = entrada.nextInt();
        
        return opcaoEscolhida;
        
    }
}
