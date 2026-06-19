
package otimizacao;

import java.util.Scanner;

public class opcao_academia {
    public static void executarOpcao(){
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Selecione uma opcao: ");
        academia.opcao = entrada.nextInt();
        entrada.nextLine();
        
        switch(academia.opcao){
            case 1 -> System.out.println("Cadastrar");
            case 2 -> System.out.println("Consultar");
            case 3 -> System.out.println("Liberar Entrada");
            case 4 -> System.out.println("Relatorio");
            case 5 -> System.out.println("Configuracoes");
            case 6 -> System.out.println("Sair");
            default -> System.out.println("ERRO! Digite uma opcao valida");
        }
        
    }
}
