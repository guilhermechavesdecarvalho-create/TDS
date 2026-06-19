
package Arrays;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        String [] produtos = new String [20];
        int opcao;
        
        do{
            System.out.println("-----CADASTRO DE PRODUTOS-----");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Listar produto");
            System.out.println("3-Buscar produto");
            System.out.println("4-Mostrar valor do estoque");
            System.out.println("5-Encerrar");
            System.out.println("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 1){
                System.out.println("-----CADASTRAR PRODUTO-----");
                System.out.println("Digite o nome do produto que voce deseja registrar: ");
                String nomeProduto = entrada.nextLine();
                
                if(nomeProduto.trim().isEmpty());
                    System.out.println("ERRO! O NOME DO PRODUTO NAO PODE SER VAZIO");
                    
            }else{
                System.out.println("Produto cadastrado com sucesso!");
            }
            }else if(opcao == 2 ){
                
        
        
        }
    }
}
