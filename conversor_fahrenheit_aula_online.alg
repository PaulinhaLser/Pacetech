algoritmo "conversorFahrenheit"

var
   grausCelsius, grausFahrenheit: real
inicio
   escreval("Digite a Temperatura em graus Fahrenheit: ")
   leia(grausfahrenheit)
   
   grausCelsius <- (grausFahrenheit - 32)/1.8
   
   escreval("A Temperatura em graus Celsius é: ",grausCelsius)
   
   se grausCelsius <= 15 entao
      escreval("Está FRIO")
      senao
      se grausCelsius <= 28 entao
         escreval("Temperatura AGRADÀVEL")
         senao
         escreval("Está CALOR")
      fimse
   fimse
fimalgoritmo
