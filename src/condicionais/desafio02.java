
package condicionais;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int saldo = 1000;
        
        do{
            System.out.println("BEM VINDO AO BANCO CENTRAL");
            System.out.println("1-Ver saldo");
            System.out.println("2-Sacar");
            System.out.println("3-Depositar");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opcao acima:");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao ==1 ){
                System.out.println("O saldo de sua conta e: R$ " + saldo);
            
            }else if(opcao ==2 ){
                System.out.println("Digite o valor que voce deseja sacar: R$ ");
                double saque = entrada.nextDouble();
                
                double valorDebito = saque; // o valor a ser debitado comeca sendo o proprio saque
                
                if(saque > 500){
                    valorDebito = saque + 10;
                    System.out.println("Saques acima de R$ 500,00 possuem uma taxa de R$ 10,00");
                    System.out.println("O valor total a ser da conta e: " + valorDebito);
                }
                
                if(saque > saldo){
                    System.out.println("SALDO INSUFICIENTE!");
                }else if(saque <= 0){
                    
                }else{
                    
                    saldo -=saque; // subtrai o valor do saldo
                
                    System.out.println("Aguarde seu valor de R$ " + saque + " sair no caixa");
                    System.out.println("O saldo atual: R$ " + saldo);
                }
                
            }else if(opcao ==3){
                System.out.println("Digite o valor que voce deseja depositar:R$ ");
                double valorDeposito = entrada.nextDouble();
                
                if(valorDeposito > 0){
                    saldo += valorDeposito;
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("O saldo atual da sua conta e: R$ " + saldo);
                }else{
                    System.out.println("Valor de deposito invalido! Digite um valor valido");
                }
                
            }else if(opcao ==4 ){
                System.out.println("SISTEMA ENCERRADO! OBRIGADO PELA PREFERENCIA");
             
            }else{
                System.out.println("ERRO! ESCOLHA UMA OPCAO VALIDA");
            } 
        }while(opcao != 4);
            
        entrada.close();
        
    }
}
        
    

