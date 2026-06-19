package funcoes;

import java.util.Scanner;

public class exercicio06 {
    public static void registrarAcesso(){
        Scanner entrada = new Scanner (System.in);
        boolean continuarRegistrando = true;
        
        System.out.println("-----REGISTRO DE ACESSOS-----");
        
        while(continuarRegistrando){
            System.out.println("Registrar entrada desse aluno? (sim/nao): ");
            String resposta = entrada.nextLine();
            
            if(resposta.trim().equalsIgnoreCase("sim")){
                
                utilitarios.contadorAcessos++;
                System.out.println("Acesso registrado com sucesso");
                System.out.println("Total de acessos no ate o momento: " + utilitarios.contadorAcessos);
                
            }else if(resposta.trim().equalsIgnoreCase("nao")){
                continuarRegistrando = false;
                System.out.println("Saindo do regsitro de acessos...");
                
            }else{
                System.out.println("ERRO! Digite apenas 'sim' ou 'nao'");
                
            }
        }
        System.out.println("O total de acesso no dia foi de: " + utilitarios.contadorAcessos);
    }
}
