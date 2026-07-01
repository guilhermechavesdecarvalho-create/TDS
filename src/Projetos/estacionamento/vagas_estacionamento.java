package Projetos.estacionamento;


public class vagas_estacionamento {
    
    public static int [] numeroVagas = {1, 2, 3,4, 5, 6, 7, 8, 9 ,10 };
    public static boolean [] statusVagas = { true,false,true,true,true,false,false,true,true,false };
    
    public static int ocuparVaga(){
        
        for(int i = 0; i <statusVagas.length; i++){
          
            if(statusVagas[i] == true){
                statusVagas[i] = false;
                return numeroVagas[i];
            }
        }
        return -1; // retorna se nao achar vaga "true"
        
    }
}
