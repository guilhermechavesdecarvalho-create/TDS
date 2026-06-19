package condicionais;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        String senhaCorreta = "1234";
        String loginCorreto = "admin";
        int opcao;
        
        int tentativas = 0;
        
        do{
            System.out.println("---BEM VINDO A EMPRESA---");
            System.out.println("1-Digitar seu login");
            System.out.println("2-Digitar sua senha");
            System.out.println("3-SAIR");
            System.out.println("ESCOLHA UMA OPCAO ACIMA: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
                System.out.println("Digite seu login no campo abaixo: " );
                String loginDigitado = entrada.nextLine().trim();
                
                if(loginDigitado.isEmpty()){
                    System.out.println("ERRO! O LOGIN NAO PODE SER VAZIO");
                }   
                    else if(!loginDigitado.equals(loginCorreto)){
                        
                        tentativas++;
                        
                        System.out.println("LOGIN INCORRETO! TENTE NOVAMENTE");
                        
                        if(tentativas < 3){
                            System.out.println("O numero de tentativas: " + (3 - tentativas));
                        }
                    }else{
                        System.out.println("LOGIN CORRETO!");
                    }
             
                }else if (opcao == 2){
                    System.out.println("Digite sua senha no campo abaixo: ");
                    String senhaDigitada = entrada.nextLine().trim();
                
                    if(senhaDigitada.isEmpty()){
                        System.out.println("ERRO! A SENHA NAO PODE SER VAZIA");
                
                    }else if(!senhaDigitada.equals(senhaCorreta)){
                        
                        tentativas++;
                        
                        System.out.println("SENHA INCORRETA! TENTE NOVAMENTE");
                        
                        if(tentativas < 3){
                            System.out.println("Tentativas restantes: " + (3 - tentativas));
                            
                        }
                    }else{
                    System.out.println("SENHA CORRETA");
                    }
                    
                }else if(opcao == 3){
                        System.out.println("Sistema encerrado. Obrigado");
                }else{
                   System.out.println("OPCAO INVALIDA");
                }
                
                if(tentativas >= 3){
                    System.out.println("----------------------");
                    System.out.println("SISTEMA BLOQUEADO!!!");
                    System.out.println("----------------------");
                    opcao =3;
                }
            }while(opcao != 3);
    
        entrada.close();
    }
}
        
    

        
