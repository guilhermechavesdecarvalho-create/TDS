package condicionais;

import java.util.Scanner;

public class desafio04 {
    
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        String continuar;
        
        System.out.println("---SISTEMA DE NOTAS DO SENAC---");
        
        do{
            System.out.println("Digite o nome do aluno: ");
            String nome = entrada.nextLine();
            
            System.out.println("Digite a nota 1: ");
            double nota1 = entrada.nextDouble();
            
            System.out.println("Digite a nota 2: ");
            double nota2 = entrada.nextDouble();
            
            System.out.println("Digite a nota 3: ");
            double nota3 = entrada.nextDouble();
            entrada.nextLine();
            
            double media = (nota1 + nota2+ nota3) / 3.0;
            
            System.out.println("---RESULTADO DO ALUNO---");
            System.out.println("O aluno " + nome);
            System.out.printf("A media final e : %.2f%n", media);
            
            if(media >= 7.0){
                System.out.println("PARABENS! O ALUNO " + nome + " esta aprovado");
            
            }else if(media >= 5.0){
                System.out.println("A situacao do aluno " + nome + " e de recuperacao");
                
            }else{
                System.out.println("Infelizmente o aluno "+ nome + " esta reprovado");
            }
            
            System.out.println("Deseja cadastrar outra nota? (1 para Sim / 2 para Nao:)");
            continuar = entrada.nextLine();
        }while(continuar.equalsIgnoreCase("1"));
        
        System.out.println("---SISTEMA ENCERRADO---");
        
        entrada.close();
        
    }
}

