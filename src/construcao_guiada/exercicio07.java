package construcao_guiada;

import java.util.Scanner;

public class exercicio07{
    public static void main(String[]args){
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja Bem-Vindo, qual e o seu nome? ");

        String nome = entrada.nextLine();

        System.out.println("O nome do cliente e: " + nome);

        System.out.println("Por gentileza, qual e a placa do seu veiculo? ");

        String placaVeiculo = entrada.nextLine();

        System.out.println("A plca do veiculo do/a " + nome + " e: " +placaVeiculo);

        System.out.println("O numero da vaga que o carro placa " + placaVeiculo + " estacionou e : ");

        String vaga = entrada.nextLine();

        System.out.println("O veiculo do/a " + nome + " que possui placa  " + placaVeiculo + " esta na vaga de numero " + vaga);

        entrada.close();
    
    }
}