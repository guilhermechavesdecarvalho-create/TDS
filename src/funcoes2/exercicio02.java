package funcoes2;

import java.util.Scanner;

public class exercicio02 {
    public static boolean autenticarOperador(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o nome do usuario: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite a senha do usuario " + nome + ":");
        int senha = entrada.nextInt();
        entrada.nextLine();
        
        if(nome.equals("admin") && senha == 2026){
            System.out.println("ACESSO LIBERADO!");
            return true;
            
        }else{
            System.out.println("ERRO! Usuario ou Senha estao incorretos");
            return false;
        }
    }
}
