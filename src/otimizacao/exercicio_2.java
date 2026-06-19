
package otimizacao;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        int opcao;
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Cadastrar");
                break;
                
            case 2:
                System.out.println("Consultar");
                break;
                
            case 3:
                System.out.println("Relatorio");
                break;
                
            case 4:
                System.out.println("Sair");
                break;
                
            default :
                System.out.println("ERRO! Digite uma opcao valida");
                
        }
        entrada.close();
    }
}
