package Projetos.academia;

public class opcao_academia {
    public static void executar(int opcao){
        
        switch(opcao){
            case 1:
                System.out.println("\n>> PLANOS: Mensal: R$ 90,00 | Anual: R$ 70,00/mes");
                break;
                
            case 2:
                System.out.println("\n>> Agentamento Realizado com Sucesso! Compareca a recepcao");
                break;
                
            case 3:
                System.out.println("\n>> HORARIOS: Segunda a Sexta: 06h as 22h | Sabado: 08h as 14h");
                break;
                
            case 0:
                System.out.println("\n>> Saindo do Sistema... Ate Logo");
                
            default:
                System.out.println("\n[ERRO] Opção inválida! Tente novamente");
                break;
        }
    }
}
