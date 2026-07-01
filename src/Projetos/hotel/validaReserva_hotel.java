package Projetos.hotel;

public class validaReserva_hotel {
    public static void realizarReserva(String [] cliente, int quartoEscolhido){
        
        if(cliente == null){
            System.out.println("ERRO! Nao e possivel realizar a reserva sem cadastro");
            return;
        }
        String nomeCliente = cliente[0];
        String cpfCliente = cliente[1];
        boolean quartoEncontrado = false;
        
        for (int i = 0; i < quartos_hotel.numeroQuartos.length; i++){
            
            if (quartos_hotel.numeroQuartos[i] == quartoEscolhido) {
                quartoEncontrado = true; 
                
                if(quartos_hotel.statusQuartos[i] == true){
                    
                    quartos_hotel.statusQuartos[i] = false;
                    
                    System.out.println("PARABENS! Reserva concluida com sucesso");
                    System.out.println("Quarto " + quartoEscolhido + " agora esta reservado por: " + nomeCliente + " (CPF: " + cpfCliente + ") ");
                    
                } else {
                    System.out.println("ERRO! O quarto " + quartoEscolhido + " ja esta ocupado");
                }
                
                break; 
            }
        }
        
        
        if(!quartoEncontrado){
            System.out.println("ERRO! O quarto numero " + quartoEscolhido + " nao existe");
        }
        
    }
} 
