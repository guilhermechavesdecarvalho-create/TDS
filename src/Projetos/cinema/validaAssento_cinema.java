package Projetos.cinema;

public class validaAssento_cinema {
    public static void realizarReserva(String [] cliente, String assentoEscolhido){
        
        if(cliente == null){
            System.out.println("ERRO! Nao e possivel realizar a reserva do assento sem cadastro");
            return;
        }
        String nomeCliente = cliente[0];
        String cpfCliente = cliente[1];
        boolean assentoEncontrado = false;
        
        for (int i = 0; i < ingressos_cinema.assentos.length; i++){
            
            if (ingressos_cinema.assentos[i].equalsIgnoreCase(assentoEscolhido)) {
                assentoEncontrado = true; 
                
                if(ingressos_cinema.statusAssentos[i] == true){
                    
                    ingressos_cinema.statusAssentos[i] = false;
                    
                    System.out.println("PARABENS! Reserva concluida com sucesso");
                    System.out.println("Assento " + assentoEscolhido + " agora esta reservado por: " + nomeCliente + " (CPF: " + cpfCliente + ") ");
                    
                } else {
                    System.out.println("ERRO! O assento " + assentoEscolhido + " ja esta ocupado");
                }
                
                break; 
            }
        }
        
        
        if(!assentoEncontrado){
            System.out.println("ERRO! O assento numero " + assentoEscolhido + " nao existe");
        }
        
    }
} 
