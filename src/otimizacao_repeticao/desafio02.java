package otimizacao_repeticao;

public class desafio02 {
    public static void main(String[]args){
        
        String [] produtos = {
            "Mouse",
            "Teclado",
            "Monitor",
            "Notebook",
            "Webcam"
        };
        
        String procurado = "Monitor";
        
        for(String produto : produtos){
            
            if(produto.equals(procurado)){
                System.out.println("Produto encontrado! Tipo: " + procurado);
                break;
            }
        }
    }
}
