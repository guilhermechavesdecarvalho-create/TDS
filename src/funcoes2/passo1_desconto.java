package funcoes2;

import java.util.Scanner;

public class passo1_desconto {
    public static double capturarValorTotal(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("====================");
        System.out.println("SISTEMA DE DESCONTOS");
        System.out.println("====================");
        
        System.out.println("Digite o valor total da compra: R$ ");
        double valorCarrinho = entrada.nextDouble();
        
        return valorCarrinho;
        
    }
}
