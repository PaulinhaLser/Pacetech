algoritmo "salario_missao3"

var
   salario, aumento, salarioAumento: real
inicio
   escreval("Digite seu Sal�rio: R$")
   leia(salario)
   
   aumento <- (salario * 30)/100
   salarioAumento <- salario + aumento
   
   escreval("Seu novo Sal�rio: R$",salarioAumento)

fimalgoritmo
