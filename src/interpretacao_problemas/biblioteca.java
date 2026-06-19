package interpretacao_problemas;


import java.util.Scanner;

public class biblioteca {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        int opcao;
        
        String matricula = "";
        boolean matriculaValidada = false;
        
        String livros [] = { //Array com o nome dos livros
            "O pequeno principe",
            "Viagem ao centro da terra",
            "Entendendo algoritmos",
            "Dom Casmurro",
            "A metamorfose"
        
        };
            
            do{
                
            System.out.println("-----MENU DA BIBLIOTECA DO SENAC-----");
            System.out.println("1-Verificar a matricula(opcao OBRIGATORIA!!!");
            System.out.println("2-Lista de Livros");
            System.out.println("3-Emprestimo de livros");
            System.out.println("4-Encerrar Sistema");
            System.out.println("Escolha uma opcao acima:");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
        
            switch(opcao){
                
                case 1:
                   System.out.println("OLA! Seja bem vindo a biblioteca do SENAC. Informe sua matricula: ");
                    matricula = entrada.nextLine();
                   
                    
                    if(matricula.isEmpty()){
                     
                        System.out.println("ERRO! Sua matricula nao pode ser vazia.");
                        matriculaValidada = false;
                        break;
                    }
                    
                    System.out.println("Matricula ativa? (true/false): ");
                    boolean ativa = entrada.nextBoolean();
                    entrada.nextLine();
                    
                    if(ativa){
                        System.out.println("PARABENS! Sua matricula esta ativa, voce agora pode escolher um livro");
                        matriculaValidada = true;
                        
                    }else{
                        System.out.println("OPS! Sua matricula esta inativa. Va a diretoria para regularizar");
                        matriculaValidada = false;
                    }
                    break;
                    
                case 2:
                    if(!matriculaValidada){
                        System.out.println("AVISO: Voce precisa validar sua matricula");
                        break;
                    }
                    
                    System.out.println("-----LISTA DE LIVROS-----");
                    for(int i = 0; i < livros.length; i++){
                        System.out.println((i + 1) + " - " + livros[i]);
                    }       // (i + 1) serve para lista com 1, 2 ,3 ...
                        // .length serve para o sistema entender o tamanho da lista( no meu caso sao 5 livros)
                    break;
                case 3:
                    if(!matriculaValidada){
                        System.out.println("AVISO: Voce precisa validar sua matricula");
                        break;
                    }
                    
                    
                    System.out.println("Ola, aluno da matricula: " + matricula);
                    System.out.println("Digite o numero do livro que voce deseja pegar (1 a " + livros.length + "): ");
                    int escolhaLivro = entrada.nextInt();
                    entrada.nextLine();
                    
                    if(escolhaLivro >= 1 && escolhaLivro <= livros.length){
                       
                        String livroEscolhido = livros[escolhaLivro - 1];
                        //serve para subtrair 1, pois o Array começa no 0
                        
                        System.out.println("PARABENS! O livro " + livroEscolhido + " foi emprestado ");
                        
                        matriculaValidada = false;
                        System.out.println("ATENCAO: Seu acesso foi bloqueado apos o emprestismo. Apos a devolucao sera liberado novo emprestimo");
                    
                    }else{
                        System.out.println("OPCAO INVALIDA! LIVRO INDISPONIVEL");
                    }
                    break;
                    
                case 4: 
                    System.out.println("SISTEMA ENCERRADO! Obrigado por ultilizar a biblioteca do SENAC");
                    break;
                    
                    
                default:
                    System.out.println("Escolha uma opcao de 1 a 4");
            }
            }while(opcao != 4);
            
            entrada.close();
            
    }
}
