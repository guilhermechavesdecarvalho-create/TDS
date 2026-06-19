package interpretacao_problemas;

import java.util.Scanner;

public class hospital {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String nome = "";
        int idade;
        int atendimentoEscolhido;
        String respostaGrave;
        boolean estadoGrave = false;
        
        String tipo [] = {
            "PRONTO-SOCORRO",
            "ATENDIMENTO PRIORIDARIO",
            "ATENDIMENTO NORMAL"
        };
        
        int qtd [] = { 5 , 15 , 20 };
        
        do{
            System.out.println("-----BEM VINDO AO HOSPITAL ALBERT LUSCAS-----");
            System.out.println("1 - Ver Painel de Vagas Disponiveis");
            System.out.println("2 - Iniciar Novo Atendimento / Triagem");
            System.out.println("3 - Sair do Sistema");
            System.out.print("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                
                case 1:
                    System.out.println("---VAGAS DISPONIVEIS NO MOMENTO---");
                    for(int i = 0; i < tipo.length; i++){
                        System.out.println((i + 1) + " - " + tipo[i] + "(Disponiveis: " + qtd[i] + ")");
                    }
                    break;
                    
                case 2:
                    System.out.println("Informe o nome do paciente: ");
                    nome = entrada.nextLine();
                    
                    while(nome.trim().isEmpty()){
                        System.out.println("ERRO! Seu nome nao pode ser vazio");
                        System.out.println("Informe o nome novamente: ");
                        nome = entrada.nextLine();
                    }
                    
                    System.out.println("Infome a idade do paciente: ");
                    idade = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.println("O paciente esta em estado grave? (S/N): ");
                    respostaGrave = entrada.nextLine().toUpperCase(); // toUpperCase usado para transformar todas as palavras do texto em maiuscula
                    estadoGrave = respostaGrave.equals("S");
                    
                    if(estadoGrave){
                        atendimentoEscolhido = 1;
                        
                    }else if(idade <= 12 || idade >= 60){
                        atendimentoEscolhido = 2;
                    }else{
                        atendimentoEscolhido = 3;
                    }
                    
                    System.out.println("---FICHA DO PACIENTE---");
                    System.out.println("Paciente: " + nome);
                    System.out.println("IDADE: " + idade);
                    System.out.println("ATENDIMENTO: " + tipo[atendimentoEscolhido - 1]);
                    
                    if(qtd[atendimentoEscolhido - 1] <= 0){
                        System.out.println("DESCULPA! O setor " + tipo[atendimentoEscolhido - 1] + " esta lotaado no momento"); 
                    }else{
                        qtd[atendimentoEscolhido - 1]--;
                        System.out.println("Atendimento agendado com sucesso! Espere o medico chamar");
                        System.out.println("RESTAM: " + qtd[atendimentoEscolhido - 1]);
                    }
                    break;
                    
                    case 3:
                    System.out.println("Encerrando o sistema hospitalar. Ate logo!");
                    break;
                    
                default:
                    System.out.println("Opcao Invalida! Tente novamente.");
            }
            
        } while (opcao != 3); 
        
        entrada.close(); 
    }
}
            