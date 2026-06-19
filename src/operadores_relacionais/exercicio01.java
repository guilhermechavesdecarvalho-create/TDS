package operadores_relaconais;

public class exercicio01 {
    
    public static void main(String[]args){
        int pinCadastrado = 1234;
        int pinDigitado = 9876;
        boolean acessoPermitido = (pinCadastrado == pinDigitado);
        System.out.println("O acesso foi liberado? " + acessoPermitido);
    }
}