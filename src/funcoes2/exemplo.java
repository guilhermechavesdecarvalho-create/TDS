
package funcoes2;
public class exemplo { //define uma classe publica chamada exemplo
    
    public static void main(String[] args) { // ponto de entrada de qualquer programa java 
        // public: qualquer um pode acessar esse metodo 
        // static:  permite que o metodo seja executado sem que a gente precise criar um "objeto" da classe
        // void:  metodo nao retorna nenhum valor 
        
        imprimirSaudacao("Carlos");
        // chamando o metodo "imprimirSaudacao"  e o texto "Lucas" como argumento para ele 
        
        
        int resultado = somar(10, 5);
        // como esse metodo retorma um numero inteiro , nos criamos uma variavel chamada "resultado"(do tipo int) para guardar o valor
        System.out.println("O resultado da soma é: " + resultado); // mostra o resultado na tela
    }

    public static void imprimirSaudacao(String nome) { // por conta do void, nao joga nenhum dado de volta 
        //"(String nome)" é o parametro . Significa que quem chamar esse método obrigatoriamente precisa passar um texto (String), que dentro do método se chamará nome.
        
        System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
    }

    public static int somar(int numero1, int numero2) { // "int" Significa que este método se compromete a devolver um número inteiro no final da sua execução
       // "(int numero1, int numero2)" Ele recebe dois parâmetros, ambos números inteiros.
        return numero1 + numero2; // A palavra-chave return cumpre a promessa do método. Ela soma os dois números e devolve (retorna) o resultado exato para a linha que o chamou (lá no main).
    }
}

