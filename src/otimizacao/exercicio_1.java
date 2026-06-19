package otimizacao;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[]args){
        int opcao; 
        Scanner entrada = new Scanner(System.in);
        opcao = entrada.nextInt();
        
        if( opcao == 1 ){
            System.out.println("Cadastrar");
            
        }else if (opcao ==2 ){
            System.out.println("Consultar");
            
        }else if(opcao == 3 ){
            System.out.println("Relatorio");
            
        }else if (opcao == 4 ){
            System.out.println("Sair");
            
        }else{
            System.out.println("ERRO! Escolha uma opcao valida");
        }
        entrada.close();
    }
}
