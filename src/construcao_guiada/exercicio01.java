package construcao_guiada;

import java.util.Scanner;

public class exercicio01{
    
    public static void main(String[]args){
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual e seu nome? ");
       
        String nome = entrada.nextLine();
       
        System.out.println("Ola, " + nome + ".Seja Bem-Vindo");
        
        entrada.close();
    }
    
}