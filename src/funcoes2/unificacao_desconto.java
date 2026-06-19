
package funcoes2;

public class unificacao_desconto {
    public static void main(String[]args){
        
        double totalBruto = passo1_desconto.capturarValorTotal();
        
        double totalLiquido = passo2_desconto.calculardesconto(totalBruto);
        
        passo3_desconto.exibirRecibo(totalLiquido);
    }
}
