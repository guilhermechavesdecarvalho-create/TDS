package otimizacao_arrays;

import java.util.Arrays;

public class exercicio01 {
    public static void main (String []args){
        
        double [] notas = { 7.5, 8.0, 6.5, 9.0, 10.0};
        double soma = 0;
        
        double maiorNota = Double.MIN_VALUE; // menor numero positivo diferente de zero que o double consegue representar   
        double menorNota = Double.MAX_VALUE; // maior numero positivo que é possivel ser armazenado
        
        for (double nota : notas ){
            soma += nota;
            
            if(nota >  maiorNota){
                maiorNota = nota;
            }
            
            if(nota < menorNota){
                menorNota = nota;
            }
        }
        double media = soma / notas.length;
        
        System.out.printf("Media das notas: %.2f%n", media); // 2 casas decimais 
        System.out.printf("Maior nota:  %.1f%n" , maiorNota); // 1 casa decimal
        System.out.printf("Menor nota: %.1f%n", menorNota); // 1 casa decimal
    }
}
