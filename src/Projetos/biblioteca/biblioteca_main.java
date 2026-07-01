package Projetos.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca_main {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        ArrayList <String> disponiveis = cadastro_biblioteca.cadastroLivros();
        
        System.out.println("---LISTA DE LIVROS---");
        for(String livro : disponiveis){
            System.out.println("- " + livro);
        }
        
        System.out.println("Digite o nome do autor do livro que voce deseja: ");
        String busca = entrada.nextLine();
        
        consultar_biblioteca.buscarLivro(disponiveis, busca);
        
        entrada.close();
    }
}

