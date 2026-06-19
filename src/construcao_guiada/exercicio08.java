package construcao_guiada;

import java.util.Scanner;

public class exercicio08{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu usuario: ");
        
        String usuario = entrada.nextLine();
        
        System.out.println("O usuario e: " + usuario);
                                  
        System.out.println("Digite sua senha: ");
            
        int senha = entrada.nextInt();
            
        System.out.println("A senha do usuario e: " + senha);
           
        System.out.println("A senha do usuario " + usuario + " e:***** ");
        
        entrada.close();
    }
}