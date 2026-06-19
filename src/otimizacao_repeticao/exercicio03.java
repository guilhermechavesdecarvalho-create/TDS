package otimizacao_repeticao;

public class exercicio03 {
    public static void main(String[]args){
        
        int [] numeros = {
            10,
            20,
            30,
            40,
            50
              
        };
        int procurado = 30;
        
        for (int numero : numeros){
            
            if(numero == procurado){
                System.out.println("O numero que foi encontrado e: " + procurado);
                break;
            }
        }
    }
}
