
package construcao_guiada;

import java.util.Scanner;

public class exercicio05{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual e o nome do produto? ");
        
        String nomeProduto = entrada.nextLine();
        
        System.out.println("O nome do produto e: " + nomeProduto);
        
        System.out.println("Qual e o preco que o produto vai ser vendido? ");
        
        String precoProduto = entrada.nextLine();
        
        System.out.println("O preco do produto e: " + precoProduto);
        
        System.out.println("Qual e a quantidade de produto em estoque? ");
        
        String quantidadeProduto = entrada.nextLine();
        
        System.out.println("A quantidade em estoque e: " + quantidadeProduto);
        
        entrada.close();
    }
}