package construcao_guiada;

import java.util.Scanner;

public class exercicio02{
    
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ola, qual e sua idade? ");
        
        String idade = entrada.nextLine();
        
        System.out.println("Idade: " + idade);
        
        entrada.close();
        
        
    }
}