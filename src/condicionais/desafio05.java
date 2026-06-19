
package condicionais;

import java.util.Scanner;
 
public class desafio05 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        int opcao;
        double precoTotal = 0.0;
        
        double precoHamburguer = 25.0;
        double precoPizza = 40.0;
        double precoRefrigerante = 8.0;
        double taxaEntrega = 10.0;
        
        
        System.out.println("---BEM VINDO A CANTINA DO LUSCAS---");
        
        do{
            System.out.println("---MENU---");
            System.out.println("1-Hamburguer duplo-cheddar -> R$ 25,00");
            System.out.println("2-Pizza de calabresa com borda de catupiry -> R$ 40,00");
            System.out.println("3-Refrigerante coca-cola -> R$ 8,00" );
            System.out.println("4-Encerrar");
            System.out.println("Escolha uma das opcoes acima:");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
                precoTotal += precoHamburguer;
                System.out.println("Hamburguer adiciona a sacola com sucesso!");
                System.out.printf("Valor total ate o momento: R$ %.2f%n", precoTotal);
               
            }else if(opcao ==2 ){
                precoTotal += precoPizza;
                System.out.println("Pizza adicionada a sacola com sucesso!");
                System.out.printf("Valor total ate o momento: R$ %.2f%n", precoTotal);
                
            }else if(opcao == 3 ){
                precoTotal += precoRefrigerante;
                System.out.println("Refrigerante adicionado a sacola com sucesso!");
                System.out.printf("Valor total ate o momento: R$ %.2f%n", precoTotal);
                
            }else if(opcao == 4){
                System.out.println("Finalizando pedido");
                
            }else{
                System.out.println("OPCAO INVALIDA! ESCOLHA UMA OPCAO VALIDA");
            }
        }while (opcao != 4);
          
        if(precoTotal == 0){
            System.out.println("Nenhum pedido foi adicionado a sacola! Atendimento encerrado");
        
        }else{
            System.out.println("---FECHAMENTO DO PEDIDO---");
            System.out.printf("O valor final foi de: R$ %.2f%n" , precoTotal);
            
            double desconto = 0.0;
            if(precoTotal > 100.0){
                desconto = precoTotal * 0.10;
                precoTotal -= desconto;
                System.out.println("PARABENS! VOCE RECEBEU FRETE GRATIS");
            }
            
                System.out.println("O cliente e vip? (S- Sim / N- Nao): ");
                String vip = entrada.nextLine();
                
                if(vip.equalsIgnoreCase("S")){
                    taxaEntrega = 0.0;
                    System.out.println("Cliente Vip! Frete Gratis.");
                }else{
                    if(taxaEntrega == 0.0){
                    System.out.println("Entrega gratis! Valor acima de R$ 100,00");
                }else{
                        System.out.printf("Entrega normal! No valor de R$ %.2f%n ", taxaEntrega);
                    }
                }
                double valorFinal = precoTotal + taxaEntrega;
                System.out.println("----------------------------------------------");
                System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n", valorFinal);
                System.out.println("---------------------------------------------");
                 
        }
        entrada.close();
    }
}

