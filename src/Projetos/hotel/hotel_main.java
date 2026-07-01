package Projetos.hotel;

import Projetos.hotel.informacoes_hotel;
import Projetos.hotel.quartos_hotel;
import Projetos.hotel.validaReserva_hotel;
import java.util.Scanner;

public class hotel_main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        String[] clienteSalvo = null;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=====BEM VINDO AO HOTEL SOFT BEDS=====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Quartos");
            System.out.println("3. Realizar Reserva");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    
                    clienteSalvo = informacoes_hotel.cadastrar();
                    break;
                    
                case 2:
                    
                    quartos_hotel.exibirQuartos();
                    break;
                    
                case 3:
                    
                    System.out.print("Digite o numero do quarto que deseja reservar: ");
                    int quartoDesejado = entrada.nextInt();
                    
                    validaReserva_hotel.realizarReserva(clienteSalvo, quartoDesejado);
                    break;
                    
                case 4:
                    
                    System.out.println("Encerrando o sistema do hotel. Ate mais!");
                    break;
                    
                default:
                    
                    System.out.println("Opcao invalida! Escolha uma opcao entre 1 e 4.");
            }
        }
        
        entrada.close();
    }
}
