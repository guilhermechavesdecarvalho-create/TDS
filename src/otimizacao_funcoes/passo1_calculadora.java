package otimizacao_funcoes;

import java.util.Scanner;

public class passo1_calculadora {
    public static double lerNumero(Scanner entrada, String mensagem){
        
        System.out.println(mensagem);
        return entrada.nextDouble();
    }
}
