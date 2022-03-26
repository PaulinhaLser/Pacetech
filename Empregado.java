package projetosemanasete;

public class Empregado {
    private String PrimeiroNome;
    private String Sobrenome;
    private float SalarioMensal;

    public Empregado(String PrimeiroNome, String Sobrenome, float SalarioMensal){
    this.setPrimeiroNome(PrimeiroNome);
    this.setSobrenome(Sobrenome);
    this.setSalarioMensal(SalarioMensal);
    }
    
    public String getPrimeiroNome(){
    return PrimeiroNome;
    }
 
    public void setPrimeiroNome(String PrimeiroNome){
    this.PrimeiroNome = PrimeiroNome;
    }

    public String getSobrenome(){
    return Sobrenome;
    }

    public void setSobrenome(String Sobrenome){
    this.Sobrenome = Sobrenome;
    }

    public float getSalarioMensal(){
    return SalarioMensal;
    }

    public void setSalarioMensal(float SalarioMensal){
        if (SalarioMensal < 0){
            this.SalarioMensal = 0;
        } else {
        this.SalarioMensal = SalarioMensal;
        }
    }
    
    public float obterSalarioAnual(){
    return (SalarioMensal * 12);
    }
    
    public float Aumento(){
        SalarioMensal = (SalarioMensal * 1.1f);
        return SalarioMensal;
    }
}
