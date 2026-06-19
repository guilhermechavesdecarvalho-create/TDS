package otimizacao_repeticao;

public class exercicio06 {
    public static void main(String[]args){
        
        String [] alunos = {
            "Ana",
            "Pedro",
            "BLOQUEADO(LUCAS)",
            "Carlos",
            "Mariana"
        };
        for(int i = 0;i< alunos.length; i++){
            
            if(alunos[i].equals("BLOQUEADO(LUCAS)")){
                continue;
            }
            System.out.println("Alunos ativos: " + alunos[i]);
        }
    }
}
