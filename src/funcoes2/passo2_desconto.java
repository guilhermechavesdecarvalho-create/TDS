package funcoes2;

public class passo2_desconto {
    public static double calculardesconto(double valorTotal){
        double valorDesconto = valorTotal;
        
        if(valorTotal >= 300){
            valorDesconto = valorTotal * 0.95;
            
        }
        return valorDesconto;   
    }
}

