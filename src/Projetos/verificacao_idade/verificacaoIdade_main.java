package Projetos.verificacao_idade;

import Projetos.verificacao_idade.verificador_idade;

public class verificacaoIdade_main {
    public static void main(String[]args){
        
        int idadeUsuario = cadastroNome_idade.coletarInformacoes();
        
        verificador_idade.ehMaiorDeIdade(idadeUsuario);
    }
}
