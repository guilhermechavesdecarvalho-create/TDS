package Arrays;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        String []alunos = new String [10];
        int [] idades = new int[10];
        int opcao;
        
        do{
            
            System.out.println("-----CADASTRO DE ALUNOS-----");
            System.out.println("1-Cadastrar aluno");
            System.out.println("2-Listar alunos");
            System.out.println("3-Buscar aluno");
            System.out.println("4-Mostrar quantidade cadastrada");
            System.out.println("5-Encerrar");
            System.out.println("Escolha uma opcao: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1){
                System.out.println("-----CADASTRO DE ALUNOS-----");
                System.out.println("Digite o nome do aluno: ");
                String nome = entrada.nextLine();
                
                if(nome.trim().isEmpty()){
                    System.out.println("ERRO! O NOME NAO PODE SER VAZIO");
                }else{
                    boolean duplicado = false;
                    for(int i=0; i<10; i++){
                        if(alunos[i] != null && alunos[i].equalsIgnoreCase(nome)){
                            duplicado = true;
                            break;
                        }
                    }   
            
            if(duplicado){
                System.out.println("ERRO! O aluno ja esta cadastrado");
            }else{
                boolean matriculaDisponivel = false;
                
                System.out.println("Digite a idade do aluno: ");
                int idade = entrada.nextInt();
                entrada.nextLine();
                
                 for(int i = 0; i <10; i++){
                        if(alunos[i] == null){
                            alunos[i] = nome.toUpperCase();
                            idades[i] = idade;
                            System.out.println("Aluno " + nome + " cadastrado na posicao [" + i + "]. ");
                           matriculaDisponivel = true;
                            break;
                        }
                    }
                if(!matriculaDisponivel){
                    System.out.println("Matricula indisponivel! Turma cheia");
                }
            }
        }
            
            } else if (opcao == 2 ){
            System.out.println("-----LISTA DE ALUNOS-----");
            
            for(int i =0 ; i<10; i++){
                if(alunos[i] != null){
                    
                    System.out.println("Aluno [" + i + "]: " + alunos[i] + "-" + idades[i] + " anos");
                
                }else{
                    System.out.println("Posicao ["+ i +"]: VAZIA");
                }
            }
        }else if(opcao==3){
            System.out.println("-----BUSCA DE ALUNOS-----");
            System.out.println("Digite o nome que voce desaja buscar: ");
            String nome = entrada.nextLine();
            boolean encontrouNome = false;
            
            for(int i = 0; i<10; i++){
                if (alunos[i] != null && alunos[i].equalsIgnoreCase(nome)) {
                        System.out.println(" O aluno " + alunos[i] + " foi encontrado na posicao [" + i + "] - Idade: " + idades[i] + " anos");
                        encontrouNome = true;
                        break;
            }
        }
        if(!encontrouNome){
            System.out.println("O nome nao foi encontrada!");
        }
        
        }else if(opcao ==4){
            System.out.println("-----CONTADOR DE ALUNOS-----");
            int vagasOcupadas = 0;
            
            for(int i = 0; i<10; i++){
                if(alunos[i] != null){
                    vagasOcupadas++;
                }
            }
            System.out.println("Vagas ocupadas: " +vagasOcupadas);
            
            System.out.println("Vagas livres: " + (10 - vagasOcupadas));
        
        }else if(opcao == 5){
            System.out.println("Obrigado! Seu atendimento foi encerrado");
            
        }else{
            System.out.println("OPCAO INVALIDA! TENTE NOVAMENTE");
        }
       
    } while(opcao != 5);
        
        entrada.close();
    }
}
