package while_dowhile;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[]args){
       Scanner entrada = new Scanner(System.in);
       int senhaCorreta = 1234;
       int senhaDigitada;
       
       do{
           System.out.println("Digite a senha: ");
           
           senhaDigitada = entrada.nextInt();
           
           if(senhaDigitada != senhaCorreta){
               System.out.println("Senha incorreta! Tente novamente");
           }
       } while(senhaDigitada != senhaCorreta);
       
        System.out.println("Acesso liberado");
        
        entrada.close();
    }
}
