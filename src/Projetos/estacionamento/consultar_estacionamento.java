package Projetos.estacionamento;

import java.util.ArrayList;

public class consultar_estacionamento {
    public static void  buscarVeiculo(ArrayList<String> lista, String termoBusca){
        
        boolean encontrado = false;
        
        System.out.println("\n---RESULTADO DA BUSCA---");
        for(String veiculos : lista  ){
            
            if(veiculos.toLowerCase().contains(termoBusca.toLowerCase())){
                System.out.println("[LOCALIZADO] -> " + veiculos);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Nenhum veiculo encontrado com essa placa:  \" "+ termoBusca + "\"");
        }
    }
}
