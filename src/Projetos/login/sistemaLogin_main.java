/*
SISTEMA DE LOGIN

O DESAFIO:
Criar uma tela de login. Esse desafio inclui as seguintes regras:

Funcionalidades: Cadastro de usuario( nome de usuario e senha ) e validação de acesso
Conteudos utilizados: String, equals, boolean  e funçoes.

*/
package Projetos.login;

import Projetos.login.usuario_login;
import Projetos.login.validacao_login;

public class sistemaLogin_main {
    public static void main(String[]args){
        
        System.out.println("---BEM VINDO AO SISTEMA DO SENAC---");
        
        String [] credenciais = usuario_login.pedirDados();
        String  usuario = credenciais[0];
        String senha = credenciais[1];
        
        boolean logado = validacao_login.validarLogin(usuario, senha);
        
        if (logado){
            System.out.println("Login Realizado com Sucesso!");
            
        }else{
            System.out.println("ERRO: Senha ou Usuario incorretos");
        }
    }
}
