package otimizacao;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        int nota;
        nota = entrada.nextInt();
        
        String resultado = (nota >= 7) ? "Aprovado" :  "Reprovado";
        System.out.println(resultado);
                            
    
    }
}
