package otimizacao_repeticao;

public class desafio01 {
    public static void main(String[]args){
        
        String [] matriculas = {
            "2024001",
            "",
            "2024002",
            "BLOQUEADA",
            "2024003",
            " ",
            "2024004"
        };
        for(int i = 0 ; i < matriculas.length; i++){
            
            if(matriculas[i].trim(). isEmpty() || matriculas[i].equals("BLOQUEADA")){
                continue;
            }
            
            System.out.println("Matriculas Validas: " + matriculas[i]);
        }
    }
}
