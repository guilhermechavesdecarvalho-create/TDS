package construcao_guiada;

import java.util.Scanner;

public class exercicio03{
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ola, qual e sua altura? ");
        
        String altura = entrada.nextLine();
        
        System.out.println("Altura: " + altura);
        
        entrada.close();
        
    }
}