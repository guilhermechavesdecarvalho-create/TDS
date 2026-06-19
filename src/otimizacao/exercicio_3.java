package otimizacao;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        int opcao;
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1 -> System.out.println("Cadastrar");
            case 2 -> System.out.println("Consultar");
            case 3 -> System.out.println("Relatorio");
            case 4 -> System.out.println("Sair");
            default -> System.out.println("ERRO! Escolha uma opcao valida");
        }
    }
}
