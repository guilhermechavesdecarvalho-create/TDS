package otimizacao;

import java.util.List;
import java.util.Scanner;

public class opcao_2 {
    public static void execucao2(List<String> nomesCadastrados){
        Scanner entrada = new Scanner(System.in);
        String nomeBusca;
        
        System.out.println("===CONSULTA DE CLIENTE===");
        System.out.println("Digite o nome que voce deseja verificar: ");
        nomeBusca = entrada.nextLine();
        
        boolean encontrado = false;
        
        for(String nomeSalvo : nomesCadastrados){
            
            if(nomeSalvo.equalsIgnoreCase(nomeBusca)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("O nome " + nomeBusca + " esta na lista dos cadastrado");
            
        }else{
            System.out.println("O nome " + nomeBusca + " nao foi encontrado na lista de cadastrados");
        }
        
    }
}
