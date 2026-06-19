package otimizacao_arrays;

import java.util.Arrays;

public class exercicio03 {
    public static void main(String[]args){
        
        double  [] produtos = {
            50.0,
            80.0,
            100.0
        };
        
        double [] produtoAlterado = Arrays.copyOf(produtos, produtos.length);
        
        produtoAlterado [0] = 999.0;
        
        System.out.println("Produtos originais: " );
        System.out.println(Arrays.toString(produtos));
        
        
        System.out.println("Produto Alterado: ");
        System.out.println(Arrays.toString(produtoAlterado));
    }
}
