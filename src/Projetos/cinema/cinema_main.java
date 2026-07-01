package Projetos.cinema;

import java.util.Scanner;
import java.util.ArrayList;

public class cinema_main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        String[] clienteSalvo = null;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=====BEM VINDO AO CINEMA DO SENAC=====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Filmes");
            System.out.println("3. Comprar Ingresso");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    
                    clienteSalvo = informacoes_cinema.cadastrar();
                    break;
                    
                case 2:
                    ArrayList<String> lista = filmes_cinema.listaFilmes();
                    System.out.println("\n---FILMES EM CARTAZ---");
                    for(String filme : lista){
                        System.out.println("-> " + filme);
                    }
                    break;
                    
                case 3:
                    ingressos_cinema.exibirAsentos();
                    
                    System.out.print("Digite a fileira e o numero do assento que deseja reservar(EX: A1): ");
                    String assentoEscolhido = entrada.nextLine();
                    
                    validaAssento_cinema.realizarReserva(clienteSalvo, assentoEscolhido);
                    break;
                    
                case 4:
                    
                    System.out.println("Encerrando o sistema do cinema. Ate mais!");
                    break;
                    
                default:
                    
                    System.out.println("Opcao invalida! Escolha uma opcao entre 1 e 4.");
            }
        }
        
        entrada.close();
    }
}

