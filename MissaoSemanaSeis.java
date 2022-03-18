package missaosemanaseis;

import java.util.Scanner;

public class MissaoSemanaSeis {

    public static void main(String[] args) {
        
        float grausCelsius, grausFahrenheit;
        float cotacaoDolar, valorDolar, valorReais;
        int opcaoMenu = 5;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        do{
            
            System.out.println("Bem vindo a sua calculadora de viagem!");
            System.out.println("Por favor, digite a opção desejada. ");

            System.out.println("=================================================");
            System.out.println("1 - Converter graus Fahrenheit para graus Celsius");
            System.out.println("2 - Converter graus Celsius para graus Fahrenheit");
            System.out.println("3 - Converter valor em Reais para valor em Dolar");
            System.out.println("4 - Converter valor em Dolar para valor em Reais");
            System.out.println("5 - Sair");
            System.out.println("=================================================");

            opcaoMenu = leitorScanner.nextInt();
            
            System.out.println();
        
            switch(opcaoMenu){
            
                case 1:
                
                    System.out.println("Informe a temperatura em graus Fahrenheit: ");
                    grausFahrenheit = leitorScanner.nextFloat();
                    grausCelsius = (grausFahrenheit - 32) / 1.8f;
                    System.out.println("");
                    System.out.println("A temperatura em graus Celsius é: " + grausCelsius);
                    break;

                case 2:
                
                    System.out.println("Informe a temperatura em graus Celsius: ");
                    grausCelsius = leitorScanner.nextFloat();
                    grausFahrenheit = (grausCelsius * 1.8f) + 32;
                    System.out.println("");
                    System.out.println("A temperatura em graus Fahrenheit é: " +grausFahrenheit);
                    break;
                    
                case 3:
                    
                    System.out.println("Informe a cotação do Dólar.");
                    cotacaoDolar = leitorScanner.nextFloat();
                    System.out.println("Informe o valor em Reais: R$");
                    valorReais = leitorScanner.nextFloat();
                    valorDolar = valorReais / cotacaoDolar;
                    System.out.println("");
                    System.out.println("Valor em Dólar é: US$"+valorDolar);
                    break;
                
                case 4:
                    
                    System.out.println("Informe a cotação do Dólar.");
                    cotacaoDolar = leitorScanner.nextFloat();
                    System.out.println("Informe o valor em Dólar: US$");
                    valorDolar = leitorScanner.nextFloat();
                    valorReais = valorDolar * cotacaoDolar;
                    System.out.println("");
                    System.out.println("O valor em Reais é: R$");
                    break;
                    
                case 5:
                    break;
            }
        }while(opcaoMenu != 5);
        
    }
    
}
