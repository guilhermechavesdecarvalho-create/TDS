/*
Essa é a função serve para o sistema pedir ao usuario o seu nome de usuario e sua senha 
*/

package Projetos.verificacao_idade;

import java.util.Scanner;

public class cadastroNome_idade {
        public static int coletarInformacoes(){
            Scanner entrada = new Scanner (System.in);


            System.out.println("===SISTEMA DE CADASTRO===");
            System.out.println("Digite o nome que voce deseja cadastrar: ");
            String nome = entrada.nextLine();

            while (nome.trim().isEmpty()){
                System.out.println("ERRO! O nome nao pode ser vazio");
                System.out.println("Digite novamente o nome: ");
                nome = entrada.nextLine();
            }
            System.out.println();

            int idade = 0;
            boolean idadeValida = false;

            while(!idadeValida){
                System.out.println("Informe a idade do usuario " + nome + ":");
                String idadeInput = entrada.nextLine().trim();

                if(idadeInput.trim().isEmpty()){
                    System.out.println("ERRO! A idade nao pode ser vazia ");
                    continue;
                }
                
               if (!idadeInput.matches("\\d+")) {
                System.out.println("ERRO! Digite apenas numeros para idade");
                
                } else {
                 // parseInt serve para converter o String em int
                idade = Integer.parseInt(idadeInput);
                idadeValida = true;
                
                }
             }
             System.out.println("Cadastro Finalizado com Sucesso!");
             System.out.println("Nome: " + nome + " | Idade: " + idade);

             return idade;
         }   
 }

