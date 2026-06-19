package menusInterativos;

import java.util.Scanner;

public class clinicaVeterinaria {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        String resposta;
        
        int idadePrioridade = 60;
        
        
        do{
            System.out.println("--------MENU-------");
            System.out.println("1-NOVO ATENDIMENTO");
            System.out.println("2-CONSULTA FILA ");
            System.out.println("3-ENCERRAR ATENDIMENTO");
            System.out.println("Escolha uma opcao acima");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao ==1 ){
               
                System.out.println("------Novo Atendimento------");
               
                System.out.println("Qual e o nome do animal? ");
                resposta = entrada.nextLine();
                
                System.out.println("Qual e a idade do tutor? ");
                
                
                int idade = entrada.nextInt();
                entrada.nextLine();
                
                System.out.println("Qual e o estado do animal? ");
                String situacao = entrada.nextLine();
                
                if( idade >= idadePrioridade || situacao.equalsIgnoreCase("grave")){
                
                    System.out.println("---ATENDIMENTO PRIORITARIO---");
                }else{
                    System.out.println("Atendimento Normal");
                
                }    
            }   
            else if(opcao == 2){
                System.out.println("Dirigir-se para o consultorio 2");
            }
            else if(opcao == 3){
                System.out.println("Obrigado! Atendimento encerrado");
            }else{
                System.out.println("Opcao invalida! Escolha uma opcao valida");
            }
        }while (opcao != 3);
        entrada.close();
        }
}


            
        
        


        
        
        
            



                
                
                
                
                
                
                
               
                
                

                
               