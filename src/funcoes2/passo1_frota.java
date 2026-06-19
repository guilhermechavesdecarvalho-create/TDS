package funcoes2;

import java.util.Scanner;

public class passo1_frota {
    public static double capturarKm(){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("===ENTRADA DE DADOS===");
        System.out.println("Digite a quilometragem rodada pelo veiculo:  ");
        double quilometragem = entrada.nextDouble();
        
        return quilometragem;
    }
}
