package funcoes;

import java.util.Scanner;

public class exercicio04 {
    public static void validarMatricula(){
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("-----VALIDACAO-----");
        System.out.println("A sua matricula esta preenchida? (true/false): ");
        
        boolean matriculaPreenchida = entrada.nextBoolean();
        entrada.nextLine();
        
        if(matriculaPreenchida){
            System.out.println("PARABENS! Sua matricula esta preenchida corretamente.");
            
        }else{
            System.out.println("OPS! Sua matricula nao esta preenchida");
            
        }
    }
    
}
