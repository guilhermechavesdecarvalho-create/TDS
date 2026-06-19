package otimizacao_funcoes;

import java.util.Scanner;

public class passo2_calculadora {
    public static char lerOperacao(Scanner entrada){
        entrada = new Scanner (System.in);
        
        System.out.println("Digite a operacao desejada(+, - , *, /): ");
        return entrada.next().charAt(0);
        
    }
}
