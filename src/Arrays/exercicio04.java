package Arrays;

import java.util.Scanner;


public class exercicio04 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        String [] vagas = new String[6];
        
        System.out.println("---CONTADOR DE VAGAS---");
        
        for(int i = 5; i >= 0 ; i--){
            System.out.println("Digite o numero da vaga  [" + i + "]: ");
            String cliente = entrada.nextLine();
            
            if(!cliente.trim().isEmpty()){
                vagas [i] = cliente;
            }else{
                vagas [i] = null;
            }
        
        }
        
            System.out.println("---VAGAS OCUPADAS---");
            int totalOcupadas = 0;
            for(int i = 5; i>= 0; i--){
            
                if(vagas[i] != null){
                System.out.println("[" + i + "] A vaga nuemro: " + vagas[i] + " esta ocupada" );
                totalOcupadas++;
            }
        }
                System.out.println("---TOTAL DE VAGAS OCUPADAS: " + totalOcupadas);
                
                entrada.close();
    }
}