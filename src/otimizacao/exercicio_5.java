package otimizacao;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        int idade;
        
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();
        
        
        System.out.println(idade >= 18 ? "Voce e maior de idade " : "Voce e menor de idade");
        
    }
}
