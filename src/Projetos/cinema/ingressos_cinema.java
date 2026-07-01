package Projetos.cinema;

public class ingressos_cinema {
    public static String [] assentos = { "A1", "B3", "C5", "D5", "D7", "E10"};
    public static boolean [] statusAssentos = { true, false, false, true, true , true};
    
    public static void exibirAsentos(){
        System.out.println("\n---CONSULTA DE INGRESSOS---");
        
        for(int i = 0; i < assentos.length; i++){
            String status = statusAssentos [i] ? "Livre" : " Ocupado";
            System.out.println("Assento: " + assentos [i] + " | Status: " + status);
         }
    }
    
}
