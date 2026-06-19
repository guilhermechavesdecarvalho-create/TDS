package otimizacao_repeticao;

public class desafio03 {
    public static void main(String[]args){
        
        String [] pacientes = {
            "Joao",
            "",
            "Maria",
            "CANCELADO",
            "Carlos",
            "EMERGENCIA",
            "Fernanda",
            "Pedro"
        };
        
        String emergencia = "EMERGENCIA";
        
        for (String paciente : pacientes){
            
            if (paciente.trim().isEmpty() || paciente.equals("CANCELADO")){
                continue;
           
            }
            if(paciente.equals(emergencia)){
                System.out.println("Equipe medica acionada!");
                break;
            }
            
            System.out.println("Chamando paciente: " + paciente);
        }
        
    }
}
