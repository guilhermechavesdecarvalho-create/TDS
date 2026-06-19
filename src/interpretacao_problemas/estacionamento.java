package interpretacao_problemas;

import java.util.Scanner;

public class estacionamento {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String placa = "";
        String nome = "";
        int vagaEscolhida;
        String cpf;
        
        double vagaVip = 50.0;
        double vagaNormal = 25.0;
        
        String tipos [] = {
            "VAGAS NORMAIS",
            "VAGAS VIPS"
        };
        
        int vagas [] = {15 , 0};
        
        do{
            System.out.println("-----BEM VINDO AO ESTACIONAMENTO DO LUSCAS-----");
            System.out.println("1-Vagas disponiveis");
            System.out.println("2-Cadastrar veiculo");
            System.out.println("3-Encerrar Sistema");
            System.out.println("Escolha uma opcao acima:");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                
                case 1: 
                    System.out.println("---TIPOS DE VAGA---");
                    for(int i = 0; i < tipos.length; i++){
                        System.out.println((i + 1) + " - " + tipos[i] + "(Disponiveis: " + vagas[i] + ")");
                    }
                    break;
                    
                case 2: 
                    System.out.println("Digite seu nome: ");
                    nome = entrada.nextLine();
                    
                    while(nome.trim().isEmpty()){
                        System.out.println("OPS! SEU NOME NAO PODE SER VAZIO");
                        nome = entrada.nextLine();
                    }
                    
                    System.out.println("---SELECIONE SEU TIPO DE VAGA---");
                    System.out.println("1-Vagas Normais (R$ " + vagaNormal + ")");
                    System.out.println("2-Vagas Vips (R$ " + vagaVip + ")");
                    System.out.println("Digite o numero do tipo de vaga que voce deseja: ");
                    
                    vagaEscolhida = entrada.nextInt();
                    entrada.nextLine();
                    
                    if(vagaEscolhida < 1 || vagaEscolhida > tipos.length){
                        System.out.println("ERRO! Esse tipo de vaga nao esta disponivel");
                        break;
                    }
                    
                    if(vagas[vagaEscolhida - 1] <= 0){
                        System.out.println("DESCULPE! A vaga do tipo: " + tipos[vagaEscolhida - 1 ] + " esta esgotada");
                        break;
                    }
                    
                    System.out.println("Digite seu cpf: ");
                    cpf = entrada.nextLine();
                    
                    
                    System.out.println("Informe sua placa: ");
                    placa = entrada.nextLine();
                    
                    
                    System.out.println("-----ORDEM DE SERVICO-----");
                    System.out.println("Cliente: " + nome);
                    System.out.println("CPF: " + cpf);
                    System.out.println("Placa: " + placa);
                    System.out.println("Vaga: " + tipos[vagaEscolhida - 1]);
                    
                    if(vagaEscolhida == 1){
                        System.out.println("VALOR: R$ " + vagaNormal);
                        
                    }else{
                        System.out.println("VALOR: R$ " + vagaVip);
                    }
                    
                    vagas[vagaEscolhida - 1]--;
                        System.out.println("Vaga reservada com sucesso!");
                        
                    break;
                    
                case 3:
                    System.out.println("SISTEMA ENCERRADO! Obrigado por ultilizar nosso site");
                    break;
                    
                default:
                    System.out.println("ESCOLHA UMA OPCAO ENTRE 1 E 3!");
            }
            
            }while(opcao != 3);
            
            entrada.close();
    }
    
}