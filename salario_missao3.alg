algoritmo "salario_missao3"

var
   salario, aumento, salarioAumento: real
inicio
   escreval("Digite seu Salário: R$")
   leia(salario)
   
   aumento <- (salario * 30)/100
   salarioAumento <- salario + aumento
   
   escreval("Seu novo Salário: R$",salarioAumento)

fimalgoritmo
