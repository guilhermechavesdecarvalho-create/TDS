package condicionais;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        int opcao;
        
        double vagaNormal = 20.0;
        double vagaVip = 50.0;
        
        int limiteVip =5;
        int limiteNormal =10;
        
        int ocupadasVip =0 ;
        int ocupadasNormal = 0;
        
        do{
            System.out.println("-----BEM VINDO AO ESTACIONAMENTO DO SENAC-----");
            System.out.println("1-Entrada de veiculo");
            System.out.println("2-Consultar vagas");
            System.out.println("3-Encerrar");
            System.out.println("Escolha uma opcao acima");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
                System.out.println("---CADASTRO DE VEICULO---");
                System.out.println("Digite a placa do veiculo: ");
                String placa = entrada.nextLine();
                
                if(placa.trim().isEmpty()){
                    System.out.println("ERRO! A PLACA NAO PODE SER VAZIA");
                
            }else{
                System.out.println("VEICULO CADASTRADO COM SUCESSO! Placa: " + placa);
            }
        
            } else if( opcao == 2){
                    System.out.println("Qual tipo de vaga o cliente deseja? VIP OU NORMAL");
                    String tipo = entrada.nextLine();
                    
                    if(tipo.equalsIgnoreCase("VIP")){
                        if(ocupadasVip < limiteVip){
                            ocupadasVip++;
                            System.out.println("O cliente escolheu uma vaga do tipo VIP");
                            System.out.println("O valor dessa vaga e de: R$ " + vagaVip);
                            System.out.println("Vagas vip restantes: " + (limiteVip - ocupadasVip));
                        }else{
                            System.out.println("As vagas vip acabaram!");
                        }
                        
                    }else if(tipo.equalsIgnoreCase("NORMAL")){
                        if(ocupadasNormal < limiteNormal){
                            System.out.println("O cliente escolheu uma vaga do tipo normal");
                            System.out.println("O valor dessa vaga e de: R$ " + vagaNormal);
                            System.out.println("O numero de vagas normais restante e: " + (limiteNormal - ocupadasNormal));
                        
                        }else{
                        System.out.println("DESCULPE! ESTACIONAMENTO NORMAL ESTA CHEIO");
                    }
                    }else{
                        System.out.println("ERRO! TIPO DE VAGA INDISPONIVEL");
                    }
            }else if(opcao ==3 ){
                // vai direto para o do-whiele
            }else{
                System.out.println("OPCAO INVALIDA! ESCOLHA UMA OPCAO VALIDA");
            }
        }while(opcao != 3);
        System.out.println("OBRIGADO! ATENDIMENTO ENCERRADO");
        
        entrada.close();
        }
   }