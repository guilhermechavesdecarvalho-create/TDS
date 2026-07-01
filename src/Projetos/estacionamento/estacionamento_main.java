package Projetos.estacionamento;

import java.util.Scanner;
import java.util.ArrayList;

public class estacionamento_main {
    public static void main(String[]args){
     
        ArrayList<String> listaVeiculos = new ArrayList<>();
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;
        
        do{
            System.out.println("\n===ESTACIONAMNETO DO SENAC===");
            System.out.println("1-Cadastrar Veiculos");
            System.out.println("2-Buscar Veiculos( por Placa ou Nome ");
            System.out.println("3-Listar Veiculos");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opcao acima: ");
            
            if(entrada.hasNextInt()){
                opcao = entrada.nextInt();
                entrada.nextLine();
                
            }else{
                System.out.println("ERRO! Digite apenas numeros");
                entrada.nextLine();
                continue;
            }
            
            switch(opcao){
                case 1: 
                    int vagaOcupada = vagas_estacionamento.ocuparVaga();
                    
                    if(vagaOcupada == -1){
                        System.out.println("Desculpe, o estacionamento esta LOTADO!");
                        
                    }else{
                        String [] dadosClientes = registroGeral_estacionamento.cadastro();
                        
                         String registroFormatado = "Vaga: " + vagaOcupada +
                                                                    " | Cliente: " + dadosClientes[0] +
                                                                    " | CPF: " + dadosClientes[1] +
                                                                     " | Placa: " + dadosClientes[2];
                    
                    listaVeiculos.add(registroFormatado);
                    System.out.println("Cadastro realizado com sucesso na vaga: " + vagaOcupada);
                     }
                    break;
                    
                case 2:
                    System.out.println("Digite o termo de busca (Placa, Nome ou Cpf: ");
                    String termo = entrada.nextLine();
                    
                    consultar_estacionamento.buscarVeiculo(listaVeiculos, termo);
                    break;
                    
                case 3:
                    System.out.println("\n----VEICULOS NO ESTACIONAMENTO----");
                    if(listaVeiculos.isEmpty()){
                        System.out.println("O estacionamento esta vazio");
                        
                    }else{
                        for(String veiculos : listaVeiculos){
                            System.out.println(veiculos);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Encerrando Sistema... Ate logo!");
                    break;
                    
                default:
                    System.out.println("OPCAO INVALIDA! Tente Novamente");
            }
        }while(opcao != 4);
        
        entrada.close();
        
    }
}
