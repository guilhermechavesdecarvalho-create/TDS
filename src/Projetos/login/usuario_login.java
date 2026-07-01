/* PROJETO: SISTEMA DE LOGIN
Nessa função o sistema pede ao usuario que coleque seus dados, como nome de usuario e senha referente ao usuario
.
*/

package Projetos.login;

import java.util.Scanner;

public class usuario_login {
    public static String [] pedirDados(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o seu usuario: ");
        String usuario = entrada.nextLine();
        
        while(usuario.trim().isEmpty()){
            System.out.println("ERRO! O usuario nao pode ser vazio");
            System.out.println("Digite novamente o usuario: ");
            usuario = entrada.nextLine();
        }
        System.out.println();
        
        System.out.println("Informe a senha do usuario " + usuario + ":");
        String senha = entrada.nextLine();
        
        while(senha.trim().isEmpty()){
            System.out.println("ERRO! A senha nao pode ser vazia");
            System.out.println("Digite a senha novamnete; ");
            senha = entrada.nextLine();
        }
        
        return new String [] {usuario, senha } ;
      }  
}
