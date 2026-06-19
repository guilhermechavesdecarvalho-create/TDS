package funcoes;

public class utilitarios {
    public static String nomeAluno = "Nao cadastrado";
    public static String matriculaAluno = "Nao cadastrada";
    public static int contadorAcessos = 0 ;
    
    
    public static void main(String[]args){
        
       
        exercicio01.exibirCabecalho();
        
        exercicio08.executarSistema();
    }
    
    public static void exibirMenu(){
        System.out.println("------MENU------");
        System.out.println("1-Cadastrar Aluno");
        System.out.println("2-Consultar Aluno");
        System.out.println("3-Liberar Entrada");
        System.out.println("4-Relatorio");
        System.out.println("5-Sair");
        
        
        
        System.out.println("----------------");
    }
}
