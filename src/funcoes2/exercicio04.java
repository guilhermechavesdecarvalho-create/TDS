package funcoes2;

import java.util.Scanner;

public class exercicio04 {
    public static int coletarMatricula(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("---MATRICULA DO ALUNO---");
        System.out.println("AVISO: A matricula deve conter apenas numeros");
        System.out.println("Digite a matricula do aluno: ");
        int matricula = entrada.nextInt();
        entrada.nextLine();
        return matricula;
        
        
    }
}
