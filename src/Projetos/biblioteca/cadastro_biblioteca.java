package Projetos.biblioteca;

import java.util.ArrayList;

public class cadastro_biblioteca {
    public static ArrayList<String> cadastroLivros (){
        ArrayList <String> livros = new ArrayList<>();
        
        livros.add("Dom Casmurro-> Machado de Assis");
        livros.add("O Pequeno Principe-> Antoine de Saint-Exupery");
        livros.add("1984-> George Orwell");
        livros.add("O Senhor dos Aneis-> J.R.R. Tolkien");
        livros.add("Cem Anos de Solidao-> Gabriel Garcia Marquez");
        livros.add("Orgulho e Preconceito-> Jane Austen");
        livros.add("Grande Sertao: Veredas-> Guimaraes Rosa");
        livros.add("O Alquimista-> Paulo Coelho");
        livros.add("Harry Potter e a Pedra Filosofal-> J.K. Rowling");
        livros.add("O Diario de Anne Frank-> Anne Frank");
        
        return livros;
    }
}
