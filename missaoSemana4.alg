algoritmo "Missao4"
var
   menu, menu2: literal
   temperaturaC, temperaturaF, temperaturaC2, temperaturaF2: real
   valorDolar, valorReal, valorDolar2, valorReal2, cotacao: real
inicio
   repita
   escreval(" Bem vindo a sua calculadora de viagem, por favor selecione a opção desejada.")
   escreval("1 - Converter Fahrenheit para Celsius")
   escreval("2 - Converter Celsius para Fahrenheit")
   escreval("3 - Converter Real para Dolar")
   escreval("4 - Converter Dolar para Real")
   escreval("5 - Encerrar")
   leia(menu)
   escolha(menu)
   
   caso "1"
   escreval("Informe a temperatura em Fahrenheit")
   leia(temperaturaF)
   temperaturaC2 <- ((temperaturaF - 32) / 1.8)
   escreval("A Temperatura em Celsius é de: " temperaturaC2)
   
   caso "2"
   escreval("Informe a temperatura em Celsius")
   leia(temperaturaC)
   temperaturaF2 <- ((temperaturaC * 1.8) + 32)
   escreval("A Temperatura em Fahrenheit é de: " temperaturaC2)
   
   caso "3"
   escreval("Informe
   
   

fimalgoritmo
