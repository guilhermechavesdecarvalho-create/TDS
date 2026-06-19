package otimizacao_repeticao;

public class exercicio04 {
    public static void main(String[]args){
        
        String [] produtos = {
            "Mouse", 
            "Teclado",
            "Monitor",
            "Notebook"
        };
        
        String procurado = "Monitor";
        
        for( String produto : produtos){
            if(produto.equals(produto)){
                System.out.println("O cliente encontrou o produto: " + procurado);
                break;
            }
        }
        
    }
}
