package operadores_relacionais;
public class exercicio03 {
    public static void main(String[]args){
        double temperaturaAtual = 26.5;
        boolean muitoQuente = (temperaturaAtual >= 30.0);
        System.out.println("A temperatura atual esta muito quente? " + muitoQuente);
        boolean muitoFrio = (temperaturaAtual <= 15.0);
        System.out.println("A temperatura atual esta muito frio? " + muitoFrio);
               
    }
}