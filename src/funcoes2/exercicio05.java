package funcoes2;

import java.util.Scanner;

public class exercicio05 {
    public static double coletarNotaVestibular(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("---SIStema DE NOTAS---");
        System.out.println("Digite a nota final (0.0 a 10.0): ");
        double nota = entrada.nextDouble();
        entrada.nextLine();
        
        while(nota < 0.0 || nota > 10.0){
            System.out.println("ERRO! Nota digitada nao e compativel");
            System.out.println("ATENCAO: A nota deve ser de 0.0 a 10.0");
            System.out.println("Digite novamnete sua nota: ");
            nota = entrada.nextDouble();
            entrada.nextLine();
        }
        return nota;
    }
        
}
