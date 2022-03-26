package projetosemanasete;

public class ProjetoSemanaSete {

    public static void main(String[] args) {
        
    System.out.println("=====================================================================");    
    
    Empregado Paula = new Empregado("Paula", "Serodio", 2500.0f);
    System.out.println("Empregado(a) com salário anual de " + Paula.getPrimeiroNome()+ " " + Paula.getSobrenome() + " é R$ " + Paula.obterSalarioAnual());
    System.out.println("Aumento de 10% ao empregado(a) " + Paula.getPrimeiroNome() + " " + Paula.getSobrenome());
    
    Empregado Pedro = new Empregado("Pedro", "Terezan", 3000.0f);
    System.out.println("Empregado(a) com salário anual de " + Pedro.getPrimeiroNome() + " " + Pedro.getSobrenome() + " é R$ " + Pedro.obterSalarioAnual());
    System.out.println("Autorizado aumento de 10% ao empregado " +  Pedro.getPrimeiroNome() + " " +  Pedro.getSobrenome());
    
    System.out.println("=====================================================================");
    Paula.Aumento();
    System.out.println("O salário anual do empregado(a) " + Paula.getPrimeiroNome() + " " + Paula.getSobrenome() + " é R$ " + Paula.obterSalarioAnual());
     
    Pedro.Aumento();
    System.out.println("O salário anual do empregado(a) " +  Pedro.getPrimeiroNome() + " " +  Pedro.getSobrenome() + " é R$ " +  Pedro.obterSalarioAnual());
    
    System.out.println("=====================================================================");
    }
    
}

    
   
