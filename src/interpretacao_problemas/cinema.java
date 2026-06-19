package interpretacao_problemas;

import java.util.Scanner;

public class cinema {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String nome = "";
        int idade;
        int filmeEscolhido;
        
        double precoInteira = 30.0;
        double precoMeia = 15.0;
        
        String filmes [] = {
            "Super Mario Galaxy: O Filme",
            "Obesessao",
            "O Diabo Veste Prada",
            "Mortal Kombat 2",
            "Michael",
            "Mestres do Universo",
            "Hokum: O Pesadelo da Bruxa",
            "Backrooms: Um Nao-Lugar"
        };
        
        int assentos [] = {10, 5, 12, 0, 15, 20, 8, 3};
        
        
        do{
            System.out.println("-----SEJA BEM VINDO AO ARCOLUSCAS-----");
            System.out.println("1-Ver catalogo de filmes");
            System.out.println("2-Escolher Filme");
            System.out.println("3-Encerrar Atendimento");
            System.out.println("Escolha uma das opcoes acima: ");
            
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                
                case 1: 
                    System.out.println("---FILMES EM CARTAZ---");
                    for(int i = 0; i < filmes.length; i++){
                        System.out.println((i + 1) + " - " + filmes[i]);
                    }
                    break;
                
                case 2:
                    System.out.println("Informe seu nome: ");
                    nome = entrada.nextLine();
                    
                    
                    while(nome.trim().isEmpty()){
                        System.out.println("ERRO! Seu nome nao pode ser vazio.");
                        nome = entrada.nextLine();
                    }
                    
                    System.out.println("---SELECIONE FILME---");
                    System.out.println("Digite o numero do filme que voce deseja: ");
                    filmeEscolhido = entrada.nextInt();
                    
                    if(filmeEscolhido < 1 || filmeEscolhido > filmes.length){
                        System.out.println("OPCAO INVALIDA!! ESTE FILME NAO ESTA DISPONIVEL");
                        entrada.nextLine();
                        break;
                    }
                    
                    if(assentos[filmeEscolhido - 1] <= 0){
                        System.out.println("DESCULPE! O filme " + filmes[filmeEscolhido - 1 ] + " esta esgotado");
                        break;
                    }
                    System.out.println("Digite sua idade: ");
                    idade = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.println("-----CARRINHO-----");
                    System.out.println("Cliente: " + nome);
                    System.out.println("Filme: " + filmes[filmeEscolhido - 1]);
                    
                    
                    if(idade <= 12 || idade >=  60 ){
                        System.out.println("INGRESSO: MEIA");
                        System.out.println("O valor e de: R$ " + precoMeia);
                             
                    }else{
                        System.out.println("INGRESSO: INTEIRA");
                        System.out.println("O valor e de: R$ " + precoInteira);
                    }
                    
                    assentos[filmeEscolhido - 1]--; //os dois traços sao usados para subtrair 1 do valor atual da variavel
                        System.out.println("Compra realizada com sucesso! Seu assento foi reservado");
                        
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
