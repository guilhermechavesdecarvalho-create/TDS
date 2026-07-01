package Projetos.academia_completo;

import java.util.ArrayList;
import java.util.Scanner;

public class academia_main {
    public static void main(String[] args) {
        ArrayList<String> listaDeAlunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 4) {
            System.out.println("\n--- MENU ACADEMIA ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Controlar Entrada (Catraca)");
            System.out.println("3. Gerar Relatorio de Alunos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcao) {
                
                case 1:
                    String novoAluno = cadastroAluno_academia.informacoes();
                    listaDeAlunos.add(novoAluno);
                    break;
                    
                case 2:
                    
                    System.out.println("\n[CATRACA] Digite o CPF para entrar:");
                    String cpfAcesso = entrada.nextLine();
                    liberarAcesso_academia.validacao(listaDeAlunos, cpfAcesso);
                    break;
                    
                case 3:
                    
                    relatorio_academia.gerarRelatorio(listaDeAlunos);
                    break;
                    
                case 4:
                    System.out.println("Saindo do sistema... Ate logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        entrada.close();
    }
}