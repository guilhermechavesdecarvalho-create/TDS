package interpretacao_problemas;

import java.util.Scanner;


public class academia {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        boolean atestadoMedico = false;
        String resposta;
        
        double planoFit = 99.99;
        double planoSmart = 119.90;
        double planoBlack = 159.90;
        
            System.out.println("---BEM VINDO A ACADEMIA DO LUSCAS---");
            
            
                
            do{
                
                System.out.println("Ola, seja bem vindo a academia do luscas. Infome seu nome: ");
                String nome = entrada.nextLine().trim();
                
                while(nome.isEmpty()){
                    System.out.println("ERRO! O nome nao pode ser vazio");
                    System.out.println("Coloque o nome corretamente!");
                    nome = entrada.nextLine().trim();
                }
                
                
                
                System.out.println("---MENU---");
                System.out.println("1-Plano Fit -> R$ 99,99 por mes" );
                System.out.println("2-Plano Smart -> R$ 119,90 por mes");
                System.out.println("3-Plano Black -> R$ 159,90 por mes");
                System.out.println("4- Encerrar Atendimento");
                System.out.println("Escolha uma opcao acima:");
                
                opcao = entrada.nextInt();
                entrada.nextLine();
                
                switch(opcao){
                    case 1:
                        System.out.println("Parabens " + nome + ", voce escolheu nosso plano fit.");
                        System.out.println("O plano escolhido tem um valor mensal de: R$ " + planoFit);
                        System.out.println(nome + ", voce possui atestado medico? (S/N): ");
                        
                        resposta = entrada.nextLine();
                        
                        if(resposta.equalsIgnoreCase("S")){
                           atestadoMedico = true;
                           
                           System.out.println("MATRICULA CONCLUIDA! VOCE JA PODE TREINAR");
                        
                        }else{
                            System.out.println("Matricula realizada, mas compareca a recepcao com seu atestado para a liberacao.");
                        }
                        
                        break;
                        
                    case 2:
                        System.out.println("Parabens " + nome + ", voce escolheu nosso plano smart");
                        System.out.println("O plano escolhido tem um valor mensal de: R$ " + planoSmart);
                        System.out.println(nome + ", voce possui atestado medico? (S/N): ");
                       
                        resposta = entrada.nextLine();
                        
                        if(resposta.equalsIgnoreCase("S")){
                            atestadoMedico = true;
                        
                            System.out.println("MATRICULA CONCLUIDA! VOCE JA PODE TREINAR");
                        
                        }else{
                            System.out.println("Matricula realizada, mas compareca a recepcao com seu atestado para a liberacao.");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Parabens " + nome + ", voce escolheu nosso plano black");
                        System.out.println("O plnao escolhido tem um valor mensal de: R$ " + planoBlack);
                        System.out.println(nome + ", voce possui atestado medico? (S/N): ");
                        
                        resposta = entrada.nextLine();
                        
                        if(resposta.equalsIgnoreCase("S")){
                                atestadoMedico = true;
                        
                            System.out.println("MATRICULA CONCLUIDA! VOCE JA PODE TREINAR");
                        
                        }else{
                            System.out.println("Matricula realizada, mas compareca a recepcao com seu atestado para a liberacao.");
                        }
                        break;
                        
                    case 4:
                        System.out.println("Obrigado pela sua atencao. Atendimento foi encerrado!");
                        break;
                        
                    default:
                        System.out.println("!!!OPCAO INVALIDA!!!TENTE NOVAMENTE");
                        break;
                        
                }
            
            }while (opcao != 4);
                
            entrada.close();
            
    }
}
        

                
            




