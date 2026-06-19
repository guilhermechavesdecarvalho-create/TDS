package otimizacao_repeticao;

public class exercicio08 {
    public static void main(String[]args){
        
        String [] usuarios = {
            "Ana",
            "Pedro",
            "Carlos",
            "Mariana"
        };
        
        for(String usuario : usuarios){
            System.out.println("Verificando: " + usuario);
            
            if(usuario.equals("Carlos")){
                System.out.println("Usuario encontrado");
                break;
            }
            
        }
    }
}
