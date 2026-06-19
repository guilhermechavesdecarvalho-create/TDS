package otimizacao_arrays;

import java.util.Arrays;

public class exercicio04 {
    public static void main(String [] args){
        
        int [] numeros = {
            50, 20, 80, 10, 30
        };
        
        Arrays.sort(numeros);
        
        int posicao = Arrays.binarySearch(numeros, 30);
        
        System.out.println("Valor encontrado na posicao: " + posicao);
    }
    
}
