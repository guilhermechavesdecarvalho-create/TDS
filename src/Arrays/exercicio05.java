
package Arrays;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        String [] vagas = new String [5];
        
        int opcao;
        
        do{
            System.out.println("----BEM VINDO AO ESTACIONAMENTO DO SENAC----");
            System.out.println("1-Cadastrar veiculo");
            System.out.println("2-Listar veiculos");
            System.out.println("3-Buscar placa");
            System.out.println("4-Contar vagas ocupadas");
            System.out.println("5-Encerrar sistema");
            System.out.println("Escolha uma opcao:");
            opcao = entrada.nextInt();
            entrada.nextLine();
        
            if (opcao == 1){
            System.out.println("-----CADASTRO DE VEICULOS-----");
            System.out.println("Digite a placa do veiculos: ");
            String placa = entrada.nextLine();
            
            if(placa.trim().isEmpty()){
                System.out.println("ERRO! A placa nao pode ser vazia");
            }else{
                boolean duplicado = false;
                for(int i = 0; i < 5; i++){
                    if(vagas[i] != null && vagas[i].equalsIgnoreCase(placa)){
                        duplicado= true;
                        break; //uso do break foi dica da IA
                    }
                }
                if(duplicado){
                    System.out.println("ERRO!A placa ja foi cadastrada");
                    
                }else{
                    boolean vagaDisponivel = false;
                    
                    for(int i = 0; i <5; i++){
                        if(vagas[i] == null){
                            vagas[i] = placa.toUpperCase();
                            System.out.println("Veiculo na vaga [" + i + "]! ");
                            vagaDisponivel = true;
                            break;
                        }
                    }
                if(!vagaDisponivel){
                    System.out.println("Vaga indisponievel!");
                }
            }
        }
            
        }else if (opcao == 2 ){
            System.out.println("-----LISTA DE VEICULOS-----");
            
            for(int i =0 ; i<5; i++){
                if(vagas[i] != null){
                    System.out.println("Vaga [" + i + "]: " + vagas[i]);
                }else{
                    System.out.println("Vaga ["+ i +"]: VAZIA");
                }
            }
        }else if(opcao==3){
            System.out.println("-----BUSCA DE PLACA-----");
            System.out.println("Digite a placa que voce desaja buscar: ");
            String placa = entrada.nextLine();
            boolean encontrouPlaca = false;
            
            for(int i = 0; i<5; i++){
                if (vagas[i] != null && vagas[i].equalsIgnoreCase(placa)) {
                        System.out.println(" Veiculo encontrado na vaga [" + i + "]");
                        encontrouPlaca = true;
                        break;
            }
        }
        if(!encontrouPlaca){
            System.out.println("A placa do veiculo nao foi encontrada!");
        }
        
        }else if(opcao ==4){
            System.out.println("-----CONTADOR DE VAGAS-----");
            int vagasOcupadas = 0;
            
            for(int i = 0; i<5; i++){
                if(vagas[i] != null){
                    vagasOcupadas++;
                }
            }
            System.out.println("Vagas ocupadas: " +vagasOcupadas);
            
            System.out.println("Vagas livres: " + (5 - vagasOcupadas));
        
        }else if(opcao == 5){
            System.out.println("Obrigado! Seu atendimento foi encerrado");
            
        }else{
            System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE");
        }
        }while(opcao != 5);
        
        entrada.close();
    }
}
                
        
