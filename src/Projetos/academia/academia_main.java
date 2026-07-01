package Projetos.academia;

import Projetos.academia.menu_academia;
import Projetos.academia.opcao_academia;

public class academia_main {
    public static void main(String[]args){
        
        int opcao;
        
        do{
            opcao = menu_academia.exibirMenu();
            
            opcao_academia.executar(opcao);
            
        }while(opcao != 0);
    }
}
