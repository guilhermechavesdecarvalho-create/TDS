
package otimizacao;

public class validacao_academia {
    public static void validarOpcao(){
        
        if(academia.opcao < 1 || academia.opcao > 6){
            System.out.println("ERRO! Essas opcoes sao invalidas");
        }
    }
}
