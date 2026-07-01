package Projetos.login;

public class validacao_login {
    public static boolean validarLogin(String usuarioDigitado, String senhaDigitada){
        
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        
        return usuarioDigitado.equals(usuarioCorreto) &&  senhaDigitada.equals(senhaCorreta);
    }
}
