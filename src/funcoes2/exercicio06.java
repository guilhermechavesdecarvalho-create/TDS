package funcoes2;

public class exercicio06 {
    public static String definirCategoria(double notaFinal){
        
        System.out.println("===SISTEMA DE BOLSA===");
        
        if(notaFinal >= 9.0){
            return "Bolsa Integral (100% de Desconto)";
            
        }else if(notaFinal >= 7.5){
            return "Bolsa Parcial(50% de Desconto)";
            
        }else if(notaFinal >= 5.0){
            return "Vaga Regular(Sem Desconto)";
            
        }else{
            return "Lista de Espera(Classificacao Nao Aprovada)";
        }
    }
}
