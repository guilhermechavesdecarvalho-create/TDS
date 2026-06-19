package funcoes2;

import java.util.Random; // random significa aleatorio. Por este motivo se ultiliza neste caso

public class exercicio07 {
    public static long gerarTokenProcessado(){ //long serve para quando o numero é muito grande, a variavel int nao comporta
        Random gerador = new Random();
        long minimo = 1_000_000_000_000L; // O "L" no final serve para que o java entende que é um numero é do tipo "long" e nao do tipo "int"
        long amplitude = 9_000_000_000_000L; // amplitude é de 9 trilhões, o numero pode variar de 0 a 8.999.999.999.999.
        
        //"gerador.nextLong()" pede para cuspir um numero totalmente aleatorio do tipo "long", negativo ou positivo
        //"Math.abs" impede que o numero gerado seja negativo.
        //"%" é um operador de resto de divisão. Quando pegamos um número gigante e dividimos por "9_000_000_000_000L", o resto dessa divisão obrigatoriamente vai ser um número entre 0 e 8.999.999.999.999. Isto limita o tamanho do sorteio.
        //"minimo +" pegamos o resultado e somamos ao minimo.
        long token = minimo + (Math.abs(gerador.nextLong()) % amplitude); 
        return token;
    }
}
