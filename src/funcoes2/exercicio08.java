package funcoes2;

public class exercicio08 {
    public static void validarRegionalMatriz(long token){ //nome da função . Ela vai aceita receber um numero inteiro muito grande(long) chamado "token"
        
        String tokenTexto = Long.toString(token); //transforma o numero em texto
        
        String prefixo = tokenTexto.substring(0,3); // pega os tres primeiros digitos 
        
        System.out.println("===VERIFICACAO DA UNIDADE MATRIZ===");
        System.out.println("Token Analisado: " + tokenTexto); //mostra o token completo que foi tranformado em texto 
        System.out.println("Prefixo de Unidade: " + prefixo); // mostra apenas os 3 primeiros digitos isolados 
        
        if(prefixo.startsWith("1") ||  prefixo.startsWith ("2") || prefixo.startsWith("3")){ //".statsWith" checa com qual caractere o texto começa
            System.out.println("[Auditoria] Unidade Matriz Confirmada. Processo Seguro." );
            
        }else{
            System.out.println("[Auditoria] Unidade Conveniada/Polo Externo Detectado");
        }
        
        
    }
}
