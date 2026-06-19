package otimizacao_arrays;

import java.util.Arrays;

public class exercicio02 {
    public static void main(String [] args){
        
        int [] notas = { 80, 60 , 100, 75, 90};
        
        int [] notasOrdenadas = Arrays.copyOf(notas, notas.length);
        
        Arrays.sort(notasOrdenadas);
        
        System.out.println("Notas originais: " + Arrays.toString(notas));
        System.out.println("Notas organizadas: " + Arrays.toString(notasOrdenadas));
    }
            
}
