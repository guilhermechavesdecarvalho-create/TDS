package otimizacao_repeticao;

public class exercicio07 {
    public static void main(String[]args){
        
        String [] emails = {
            "ana@gmail.com",
            "",
            "pedro@gmail.com",
            "",
            "carlos@gmail.com"
        };
        for(int i = 0 ; i < emails.length; i++){
            
            if(emails[i].isEmpty()){
                continue;
            }
            System.out.println("Emails: " + emails[i]);
        }
    }
}
