package otimizacao_funcoes;

public class passo03_calculadora {
    public static double calcular(double n1, double n2, char op){
        switch(op){
            case '+' : return n1 + n2;
            case '-' : return n1 - n2;
            case '*' : return n1*n2;
            case '/' : 
                if(n2 == 0){
                    System.out.println("ERRO: Divisao por zero nao existe");
                    return Double.NaN; // SERVE PARA REPRESENTAR UMA OPERACAO IMPOSSIVEL OU INDEFINIDA
                    
                }
                return n1/n2;
                
            default:
                System.out.println("Operacao  inavalida!");
                return Double.NaN;
        }
    }
}
