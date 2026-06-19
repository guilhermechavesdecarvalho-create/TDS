package funcoes2;

import java.util.Scanner;

public class passo1_academia {
    public static double notaAluno(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual e a sua nota? ");
        double nota = entrada.nextDouble();
        
        entrada.close();
        
        return nota;
    }
    public static void main(String[]args){
        double notaFinal = notaAluno();
        
        System.out.println("A nota final foi: " + notaFinal);
        
        String veredito = passo2_academia.notaCorte(notaFinal);
        
        passo3_academia.exibirBoletim(veredito);
    }
}
