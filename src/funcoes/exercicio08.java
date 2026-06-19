package funcoes;

import java.util.Scanner;

public class exercicio08 {
    public static void executarSistema(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do{
            utilitarios.exibirMenu();
            
            System.out.println("Escolha uma opcao (1 a 5): ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                case 1: 
                    exercicio02.cadastrarAluno();
                    break;
                    
                case 2:
                    exercicio03.consultarAluno();
                    break;
                    
                case 3:
                    exercicio04.validarMatricula();
                    break;
                    
                    
                case 4:
                    exercicio07.exibirRelatorio();
                    break;
                    
                case 5:
                    System.out.println("Encerrando Sistema ");
                    break;
                    
                default:
                    System.out.println("OPCAO INAVALIDA!");
            }
            System.out.println("Precione ENTER para continuar ");
            entrada.nextLine();
            
        }while(opcao != 5);
    }
}
