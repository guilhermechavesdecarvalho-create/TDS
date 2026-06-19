package funcoes;
 
import java.util.Scanner;

public class exercicio03 {
    
    public static void consultarAluno(){
        Scanner entrada = new Scanner(System.in);
        String nome;
        String matricula;
        
        System.out.println("Digite o nome que voce deseja consultar: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite a matricula do aluno: ");
        matricula = entrada.nextLine();
        
        System.out.println("-----FICHA-----");
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}
