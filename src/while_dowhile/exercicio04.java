package while_dowhile;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        int opcao;
        
        do{
            System.out.println("Digite um nome de usuario: ");
            
            nome = entrada.nextLine();
            System.out.println("Nome " + nome + " cadastrado com sucesso");
            System.out.println("---------------------------------------");
            
            System.out.println("Deseja continuar?");
           
            System.out.println("1-sim");
           
            
            System.out.println("2-nao");
            
            System.out.println("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
               
            }
        }while(opcao != 2);
            System.out.println("Sistema encerrado");
            
            entrada.close();
    }
    
}
