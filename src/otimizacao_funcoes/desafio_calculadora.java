package otimizacao_funcoes;

import java.util.Scanner;

public class desafio_calculadora {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("===CALCULADORA DO SENAC===");
        
        double num1 = passo1_calculadora.lerNumero (entrada, "Digite o primeiro numero : ");
        char operacao = passo2_calculadora.lerOperacao(entrada);
        double num2 = passo1_calculadora.lerNumero (entrada, "Digite o segundo nuemero: ");
        
        double resultado = passo03_calculadora.calcular(num1, num2, operacao);
        
        if(!Double.isNaN(resultado)){
            passo04_calculadora.exibirResultado(num1, num2, operacao, resultado);
        }
        entrada.close();
    }
}
