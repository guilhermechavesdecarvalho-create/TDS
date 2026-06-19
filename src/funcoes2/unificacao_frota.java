package funcoes2;

import java.util.Scanner;

public class unificacao_frota {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        double km = passo1_frota.capturarKm();
        
        System.out.println("Digite a quantidade de litros abastecidos: ");
        double litros = entrada.nextDouble();
        System.out.println();
        
        double consumoFinal = passo2_frota.calcularConsumo(km, litros);
        
        passo3_frota.exibirRelatorioFrota(consumoFinal);
        
    }
}
