package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        String [] nomes = new String[5];
        
        System.out.println("---CADASTRO DE NOMES---");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do cliente [" + i + "]: ");
            nomes[i] = entrada.nextLine();
        }
        
            System.out.println("---NOMES CADASTRADOS---");
            for(int i = 0; i < 5; i++){
                System.out.println("O nome na posicao [" + i +"] e : " + nomes[i]);
            
                }
                System.out.println("Qual o nome que deseja verificar?");
                String cadastro = entrada.nextLine();
                
                boolean encontrado = false;
                
                for(int i = 0; i < 5; i++){
                if(nomes[i].equalsIgnoreCase(cadastro)){
                    System.out.println("O nome " + cadastro + " foi encontrado na posicao [" + i + "]");
                    encontrado = true;
                }
            }
            
            if(!encontrado){
                    System.out.println("O nome " + cadastro + " nao foi encontrado na lista");
            }
                entrada.close();
    }
}
    

