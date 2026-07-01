package Projetos.hotel;

public class quartos_hotel {
    
    public static int [] numeroQuartos = {101, 102, 305, 510, 110};
    public static boolean [] statusQuartos = {true, true, false, false, true};
    
    public static void exibirQuartos(){
        System.out.println("\n---CONSULTA DE QUARTOS---");
        
        for(int i = 0; i < numeroQuartos.length; i++){
            String status = statusQuartos[i] ? "Livre" : "Ocupado"; // o "?" serve para perguntar se é verdadeiro e o ":" funciona como se nao 
            System.out.println("Quarto: " + numeroQuartos[i] + "| STATUS: " + status);
            
        }
    }
}
