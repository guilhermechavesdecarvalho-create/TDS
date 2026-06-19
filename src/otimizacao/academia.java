package otimizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
        

public class academia {
    public static int opcao = 0;
    public static String nome = "";
    public static String cpf = "";
    public static List<String> nomesCadastrados = new ArrayList<>();
    
    public static void main(String[]args){
        
        do{
        menu_academia.exibirMenu();
        opcao_academia.executarOpcao();
        validacao_academia.validarOpcao();
        
        switch(opcao){
            case 1:
                opcao_1.execucao1();
                break;
                
            case 2:
                opcao_2.execucao2(nomesCadastrados);
                break;
                
            case 6:
                System.out.println("Encerrando Sistema! Volte Sempre");
                break;
                
            default :
                System.out.println("ERRO! Esoclha uma opcao valida");
                break;
        }
        }while(opcao != 6);
                
    }
}
           
        
    
