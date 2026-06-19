package funcoes2;

import java.util.Scanner;

public class exercicio03 {
    public static String coletarNome(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("---NOME DO ALUNO---");
        System.out.println("AVISO: O nome deve ser completo!");
        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        return nome;
    }
}
