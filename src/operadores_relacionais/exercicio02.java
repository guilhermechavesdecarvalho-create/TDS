package operadores_relacionais;
public class exercicio02 {
    public static void main(String[]args){
        int idadeCliente = 17;
        int podeEntrar = 18;
        boolean acessoLiberado = (idadeCliente >= podeEntrar);
        System.out.println("Cliente possui idade permitida: " + acessoLiberado);
    }
}