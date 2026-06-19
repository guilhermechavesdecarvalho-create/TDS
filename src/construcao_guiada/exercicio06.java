package construcao_guiada;

import java.util.Scanner;

public class exercicio06{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ola, qual e seu nome? ");
        
        String nome = entrada.nextLine();
        
        System.out.println("O nome do cliente e: " + nome);
        
        System.out.println("Informe o saldo disponivel de " + nome + ":");
        
        String saldo = entrada.nextLine();
        
        System.out.println("O saldo de " + nome + " e: " + saldo);
        
        entrada.close();
    }
}