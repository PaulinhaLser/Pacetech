algoritmo "Missao4"
var
   menu, menu2: literal
   temperaturaC, temperaturaF: real
   valorDolar, valorReal, cotacao: real
   voltarMenu: logico
inicio
   voltarMenu <- verdadeiro
   repita
   escreval(" Bem vindo a sua calculadora de viagem, por favor selecione a op��o desejada.")
   escreval("1 - Converter Fahrenheit para Celsius")
   escreval("2 - Converter Celsius para Fahrenheit")
   escreval("3 - Converter Real para Dolar")
   escreval("4 - Converter Dolar para Real")
   escreval("5 - Encerrar")
   leia(menu)
   escolha(menu)
   
   caso "1"
   escreval("Informe a temperatura em Fahrenheit: ")
   leia(temperaturaF)
   temperaturaC <- (temperaturaF - 32) / 1.8
   escreval("A Temperatura em Celsius � de: ",temperaturaC)
   
   caso "2"
   escreval("Informe a temperatura em Celsius: ")
   leia(temperaturaC)
   temperaturaF <- (temperaturaC * 1.8) + 32
   escreval("A Temperatura em Fahrenheit � de: ",temperaturaF)
   
   caso "3"
   escreval("Informe cota��o do Dolar: ")
   leia(cotacao)
   escreval("Informe valor em Reais: ")
   leia(valorReal)
   valorDolar <- (valorReal / cotacao)
   escreval("Valor em Dolar � de: US$",valorDolar:3:2)
   
   caso "4"
   escreval("Informe cota��o do Dolar: ")
   leia(cotacao)
   escreval("Informe valor em Dolar: ")
   leia(valorDolar)
   valorReal<- (valorDolar / cotacao)
   escreval("Valor em Reais � de: R$",valorReal:3:2)
   
   caso "5"
   interrompa
   
   outrocaso
   escreval("Informe um Op��o V�lida")
   fimescolha

   repita
   escreval("Desejar escolher outra op��o? (s-sim / n-n�o)")
   leia(menu2)
   
   ate (menu2 = "n") ou (menu2 = "s")
   
   se(menu2 = "n") entao
      voltarMenu <- Falso
   senao
      limpatela
   fimse
   
   ate (menu = "5") ou (voltarMenu = Falso)
   
   escreval("Tenha uma Boa Viagem!")

fimalgoritmo
